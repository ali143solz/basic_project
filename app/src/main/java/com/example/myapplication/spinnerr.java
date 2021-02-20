package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class spinnerr extends AppCompatActivity {
  Spinner sp;
    String[] countries={"Pakistan","India","Iran","Afganistan","Iraq","Sham","Qatar","Oman","Russia","Sham","Brazil","China","France","Australia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinnerr);
        sp=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,countries);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index=sp.getSelectedItemPosition();
                Toast.makeText(getApplicationContext(),"You Selected Country "+countries[index],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}