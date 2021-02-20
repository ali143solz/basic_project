package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listview extends AppCompatActivity {
ListView lv;
String[] countries={"Pakistan","India","Iran","Afganistan","Iraq","Sham","Qatar","Oman","Russia","Sham","Brazil","China","France","Australia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
         lv=(ListView) findViewById(R.id.lstview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,countries);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             int index=position;
                Toast.makeText(getApplicationContext(),"Your Selected Country "+countries[index],Toast.LENGTH_LONG).show();
            }
        });
    }
}