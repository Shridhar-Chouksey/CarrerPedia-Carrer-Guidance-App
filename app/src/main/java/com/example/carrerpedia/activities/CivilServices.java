package com.example.carrerpedia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView;
import android.widget.Toast;

import com.example.carrerpedia.R;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class CivilServices extends AppCompatActivity {

    SearchView searchbar;
//    EditText searchlistviewET;
    ArrayAdapter<String> civilservicesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_services);

//          searchlistviewET=findViewById(R.id.searchlistviewET);
          searchbar=(SearchView)findViewById(R.id.search_bar);
        ListView civilservicesListView= findViewById(R.id.civilserviceslist);

        final ArrayList<String> civilserviceslistarray=new ArrayList<String>(asList(
                "Civil Services as a Career",
                "Indian Administrative Service (IAS)",
                "Indian Police Service (IPS)",
                "Indian Forest Service (IFoS)",
                "Indian Foreign Service (IFS)",
                "Indian Audit and Accounts Service (IAAS)","Indian Civil Accounts Service (ICAS)",
                "Indian Corporate Law Service (ICLS)",
                "Indian Defence Accounts Service (IDAS)",
                "Indian Defence Estates Service (IDES)",
                "Indian Information Service (IIS)",
                "Indian Ordinance Factories Service (IOFS)",
                "Indian Communication Finance Services (ICFS)",
                "Indian Postal Service (IPoS)",
                "Indian Railway Accounts Service (IRAS)",
                "Indian Railway Personnel Service (IRPS)",
                "Indian Railway Traffic Service (IRTS)",
                "Indian Revenue Service (IRS)",
                "Indian Trade Service (ITS)",
                "Railway Protection Force (RPF)",
                "Armed Forces Headquarters Civil Service",
                "DANICS",
                "DANIPS",
                "Pondicherry Civil Service",
                "Pondicherry Police Service"
        ));



         civilservicesAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,civilserviceslistarray);

        civilservicesListView.setAdapter(civilservicesAdapter);

        civilservicesListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),""+civilserviceslistarray.get(position)+" choice is chosen",Toast.LENGTH_SHORT).show();

                if(position==0) {
                    Intent intent = new Intent(CivilServices.this, CivilServicesAsCarrer.class);
                    startActivity(intent);
                }
                if(position==1) {
                    Intent intent = new Intent(CivilServices.this, IASChosenActvity.class);
                    startActivity(intent);
                }
                if(position==2) {
                    Intent intent = new Intent(CivilServices.this, IPSchosenActivity.class);
                    startActivity(intent);
                }
                if(position==3) {
                    Intent intent = new Intent(CivilServices.this, IFoSchosenActivity.class);
                    startActivity(intent);
                }




            }
        });


      searchbar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
          @Override
          public boolean onQueryTextSubmit(String query) {
              CivilServices.this.civilservicesAdapter.getFilter().filter(query);
              return false;
          }

          @Override
          public boolean onQueryTextChange(String newText) {
              CivilServices.this.civilservicesAdapter.getFilter().filter(newText);
              return false;
          }
      });

    }
}