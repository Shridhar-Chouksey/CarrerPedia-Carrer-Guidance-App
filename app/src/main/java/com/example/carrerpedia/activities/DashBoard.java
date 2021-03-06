package com.example.carrerpedia.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.carrerpedia.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class DashBoard extends AppCompatActivity {

    List<SlideModel> slideModelList1;
    ImageSlider imageSlider1,imageSlider2,imageSlider3,imageSlider4,imageSlider5;

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        imageSlider1=(ImageSlider)findViewById(R.id.image_slider1);
        imageSlider2=(ImageSlider)findViewById(R.id.image_slider2);
        imageSlider3=(ImageSlider)findViewById(R.id.image_slider3);
        imageSlider4=(ImageSlider)findViewById(R.id.image_slider4);
        imageSlider5=(ImageSlider)findViewById(R.id.image_slider5);

        addImages();

        navigationView=findViewById(R.id.navigationView);
        drawerLayout=findViewById(R.id.drawer);

        actionBarDrawerToggle=new ActionBarDrawerToggle(DashBoard.this,drawerLayout,R.string.open,  R.string.close);
        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.more:

                        final String playstore = "GreenDonor EERC Project ITDC India Epress"; // getPackageName() from Context or Activity object
                        final String browser = "GreenDonor+EERC+Project+ITDC+India+Epress";
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:" + playstore)));
                        } catch (android.content.ActivityNotFoundException anfe) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=pub:" + browser)));
                        }

                        break;

                        case R.id.rate:
                            Uri uri = Uri.parse("market://details?id=" + getPackageName());
                            Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_NEW_DOCUMENT | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                            }
                            try {
                                startActivity(goToMarket);
                            } catch (ActivityNotFoundException e) {
                                startActivity(new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                            }
                        break;

                    case R.id.privacypolicy:

                        Intent intent=new Intent(DashBoard.this,Privacy.class);
                        startActivity(intent);
                        break;


                    case R.id.theme:

                        startActivity(new Intent(DashBoard.this,ThemeActivity.class));
                        break;


                    case R.id.shareus:

                        Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Download CarrerPedia App");
                        String app_url = " https://play.google.com/store/apps/details?id="+getPackageName();
                        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
                        startActivity(Intent.createChooser(shareIntent, "Share via"));

                        break;


                }

                return true;
            }
        });





    }

     void addImages() {

        slideModelList1=new ArrayList<>();           //made the list as dynamic, now it can take any no of images

         slideModelList1.add(new SlideModel(R.drawable.upscnew,"Govt Services", ScaleTypes.FIT));       // Rule: Image,Title,Scale
         slideModelList1.add(new SlideModel(R.drawable.iasips,"Govt Services", ScaleTypes.FIT));
         slideModelList1.add(new SlideModel(R.drawable.carrerguide,"Confused about Career? CareerPedia is the solution", ScaleTypes.FIT));
         imageSlider1.setImageList(slideModelList1,ScaleTypes.FIT);

         slideModelList1=new ArrayList<>();
         slideModelList1.add(new SlideModel(R.drawable.eng3,"Engineering as a Career Opportunity",ScaleTypes.FIT));
         slideModelList1.add(new SlideModel(R.drawable.eng2new,"Engineering as a Career Opportunity",ScaleTypes.FIT));
         slideModelList1.add(new SlideModel(R.drawable.eng1,"Confused about Career? CareerPedia is the solution",ScaleTypes.FIT));
         imageSlider2.setImageList(slideModelList1,ScaleTypes.FIT);

         slideModelList1=new ArrayList<>();
         slideModelList1.add(new SlideModel(R.drawable.doctornew,"Medical as a Career Opportunity",ScaleTypes.FIT));
         slideModelList1.add(new SlideModel(R.drawable.doctor2,"Medical as a Career Opportunity",ScaleTypes.FIT));
         slideModelList1.add(new SlideModel(R.drawable.doctor3,"Medical as a Career Opportunity",ScaleTypes.FIT));
         imageSlider3.setImageList(slideModelList1,ScaleTypes.FIT);

         slideModelList1=new ArrayList<>();
         slideModelList1.add(new SlideModel(R.drawable.commerce2,"Commerce as a Career Opportunity",ScaleTypes.FIT));
         slideModelList1.add(new SlideModel(R.drawable.commerce,"Commerce as a Career Opportunity",ScaleTypes.FIT));
         slideModelList1.add(new SlideModel(R.drawable.commerce3,"Commerce as a Career Opportunity",ScaleTypes.FIT));
         imageSlider4.setImageList(slideModelList1,ScaleTypes.FIT);

         slideModelList1=new ArrayList<>();
         slideModelList1.add(new SlideModel(R.drawable.law,"Law as a Career Opportunity",ScaleTypes.FIT));
         slideModelList1.add(new SlideModel(R.drawable.law2,"Law as a Career Opportunity",ScaleTypes.FIT));
         slideModelList1.add(new SlideModel(R.drawable.law3,"Law a Career Opportunity",ScaleTypes.FIT));
         imageSlider5.setImageList(slideModelList1,ScaleTypes.FIT);







     }

    public void ViewChoices(View view) {


        switch (view.getId()){

            case R.id.civilservicesbtn:

                Intent intent=new Intent(DashBoard.this,CivilServices.class);
                startActivity(intent);
                break;

            case R.id.engineerbtn:
                   startActivity(new Intent(DashBoard.this,Engineering.class));
                break;

            case R.id.medicalbtn:
                startActivity(new Intent(DashBoard.this,MedicalActivity.class));
                break;

            case R.id.commercebtn:
                startActivity(new Intent(DashBoard.this,CommerceActivity.class));
                break;

            case R.id.lawbtn:
                startActivity(new Intent(DashBoard.this,LawActivity.class));
                break;

        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return actionBarDrawerToggle.onOptionsItemSelected(item)||super.onOptionsItemSelected(item);
    }
}