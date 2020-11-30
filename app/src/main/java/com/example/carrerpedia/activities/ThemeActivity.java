package com.example.carrerpedia.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.carrerpedia.R;

public class ThemeActivity extends AppCompatActivity {

    Button themeBT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
         themeBT=findViewById(R.id.themeBT);

         themeBT.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
             }
         });

        SharedPreferences sharedPreferences=getSharedPreferences("sharedPrefs",MODE_PRIVATE);
        final SharedPreferences.Editor editor=sharedPreferences.edit();
        final boolean isDarkModeOn=sharedPreferences.getBoolean("isDarkModeOn",false);

        if(isDarkModeOn){

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            themeBT.setText("Disable Dark Mode");
        }
        else{

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            themeBT.setText("Enable Dark Mode");

        }

       themeBT.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               // When user taps the enable/disable
               // dark mode button
               if (isDarkModeOn) {

                   // if dark mode is on it
                   // will turn it off
                   AppCompatDelegate
                           .setDefaultNightMode(
                                   AppCompatDelegate
                                           .MODE_NIGHT_NO);
                   // it will set isDarkModeOn
                   // boolean to false
                   editor.putBoolean(
                           "isDarkModeOn", false);
                   editor.apply();

                   // change text of Button
                   themeBT.setText(
                           "Enable Dark Mode");
               }
               else {

                   // if dark mode is off
                   // it will turn it on
                   AppCompatDelegate
                           .setDefaultNightMode(
                                   AppCompatDelegate
                                           .MODE_NIGHT_YES);

                   // it will set isDarkModeOn
                   // boolean to true
                   editor.putBoolean(
                           "isDarkModeOn", true);
                   editor.apply();

                   // change text of Button
                   themeBT.setText(
                           "Disable Dark Mode");
               }

           }
       });
    }
}