package com.example.carrerpedia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.carrerpedia.R;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Engineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);

        ListView engineeringListView= findViewById(R.id.engineeringlist);

        final ArrayList<String> engineeringlistarray=new ArrayList<String>(asList(
                "Engineering as a Career",
                "Computer Engineer",
                "Aeronautical Engineer",
                "Civil Engineer",
                "Automobile Engineer",
                "Agricultural Engineer",
                        "Biomedical Engineer",
                        "Biotechnologist",
                        "Broadcast Engineer",
                        "Communication Engineer",
                        "Ceramic Engineer",
                        "Chemical Engineer",
                        "Environmental Engineer",
                        "Electrical Engineer",
                        "Earthquake Engineer",
                        "Electronics Engineer",
                        "Fire Engineer",
                        "Genetic Engineer",
                        "Industrial & Production Engineer",
                        "Instrumentation Engineer",
                        "Marine Engineer",
                        "Mechanical Engineer",
                        "Metallurgical Engineer",
                        "Mining Engineer",
                        "Material Engineer",
                        "Nuclear Engineer",
                        "Ocean Engineer",
                        "Petroleum Engineer",
                        "Plastic Technologist",
                        "Polymer Engineer",
                        "Rubber Technologist",
                        "Space Technologist",
                        "Textile Engineer"

        ));



        ArrayAdapter<String> engineeringAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,engineeringlistarray);

        engineeringListView.setAdapter(engineeringAdapter);

        engineeringListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),""+engineeringlistarray.get(position)+" choice is chosen",Toast.LENGTH_SHORT).show();

                if(position==0) {
                    Intent intent = new Intent(Engineering.this, EngineeringAsCareer.class);
                    startActivity(intent);
                }
                if(position==1) {
                    Intent intent = new Intent(Engineering.this, ComputerEngineerActivity.class);
                    startActivity(intent);
                }

                }

        });


    }
}
