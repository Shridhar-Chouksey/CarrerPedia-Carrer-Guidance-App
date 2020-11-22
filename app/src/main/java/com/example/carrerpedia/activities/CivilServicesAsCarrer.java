package com.example.carrerpedia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.carrerpedia.R;

public class CivilServicesAsCarrer extends AppCompatActivity {
   TextView textView1;
   TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_services_as_carrer);

     textView1=(TextView)findViewById(R.id.civilservicesTextView);
     textView2=(TextView)findViewById(R.id.CivilServicesContent);



    }
}