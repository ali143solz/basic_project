package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secactivity extends AppCompatActivity {


    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secactivity);
    tv=(TextView)findViewById(R.id.tvdata);
        Intent it=new Intent();
        String firstname=it.getStringExtra("firstname");
        String Lastname=it.getStringExtra("lastname");
        tv.setText(" First Name is "+firstname+ "Last Name is "+Lastname);
    }
}