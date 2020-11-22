 package com.example.carrerpedia.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.UnicodeSetSpanner;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.carrerpedia.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

 public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText emailET, passwordET;

    private Button loginbtn;
    private TextView signUpText;
    private String email, password;
    ValidateInput validateInput;
    FirebaseAuth mAuth;
    private ProgressBar progressBar;
    GoogleSignInClient mGoogleSignInClient;
    int RC_SIGN_IN=1;

    @Override
    public void onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        }

        this.finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        validateInput = new ValidateInput(this);
        emailET = findViewById(R.id.email_ET);
        passwordET = findViewById(R.id.password_ET);
        loginbtn = findViewById(R.id.login_btn);
        signUpText = findViewById(R.id.signUp_TV);

        loginbtn.setOnClickListener(this);
        signUpText.setOnClickListener(this);
        SignInButton signInButton =(SignInButton) findViewById(R.id.sign_in_button);
        mAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);


        //These 3 lines of code will check if the user is already logged in,then login the user and go directly to dashboard
        if(mAuth.getCurrentUser()!=null){
       Intent intent=new Intent(LoginActivity.this,DashBoard.class);
            startActivity(intent);
        }

        //adding google sign in
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);


        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        signIn();

            }
        });



    }

    private void signIn(){
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
//        Intent intent=new Intent(LoginActivity.this,DashBoard.class);
//        startActivity(intent);
//    }



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);

                firebaseAuthWithGoogle(account.getIdToken());
            } catch (ApiException e) {
                // Google Sign In failed, update UI appropriately

                Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
                // ...
            }
        }
    }
    private void firebaseAuthWithGoogle(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(LoginActivity.this,user.getEmail()+user.getDisplayName(),Toast.LENGTH_SHORT).show();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(LoginActivity.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }

                        // ...
                    }
                });
    }

     private void updateUI(FirebaseUser user) {
         Intent intent=new Intent(LoginActivity.this,DashBoard.class);
         startActivity(intent);
    }


     @Override
    public void onClick(View view) {
        int id=view.getId();

        switch(id){

            case R.id.login_btn: {
                handleLoginBtnClick();
                break;
            }
            case R.id.signUp_TV: {
                handleSignUpClick();
                break;
            }


        }

    }

    private void handleLoginBtnClick() {
        //  TODO: Validate email and password fields input

        showProgressBar();
        email = emailET.getText().toString();
        password=passwordET.getText().toString();

        if(validateInput.checkIfEmailIsValid(email)&&validateInput.checkIfPasswordIsValid(password)){


            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful())
                    {
                        hideProgressBar();

                        Toast.makeText(LoginActivity.this,"Logged in user "+email,Toast.LENGTH_SHORT).show();
                        //TODO:show another screen on login.See how to logout.

                        Intent userAccountActivity=new Intent(LoginActivity.this,DashBoard.class);
                        startActivity(userAccountActivity);


                    }
                    else {
                        hideProgressBar();
                        Toast.makeText(LoginActivity.this,"Error occured "+task.getException(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
            //  TODO: Login the user with email and password.To do this firebase , login this user

        }



    }

    private void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);

    }

    private void hideProgressBar() {
        progressBar.setVisibility(View.INVISIBLE);
    }


    private void handleSignUpClick() {
        Toast.makeText(this,"Sign up here",Toast.LENGTH_SHORT).show();
        Intent SignUpActivity=new Intent(LoginActivity.this,SignUpActivity.class);
        startActivity(SignUpActivity);

    }
}