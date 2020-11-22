package com.example.carrerpedia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.carrerpedia.R;

public class SplashScreen extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        handler=new Handler();
   handler.postDelayed(new Runnable() {
       @Override
       public void run() {

           startActivity(new Intent(SplashScreen.this,LoginActivity.class));
       }
   },3000);

    }
}