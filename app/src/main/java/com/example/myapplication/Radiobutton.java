package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Radiobutton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
        RadioGroup rdbgroup=(RadioGroup) findViewById(R.id.rdbgroup);
        rdbgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdb1=(RadioButton) findViewById(R.id.rdb1);
                if(rdb1.isChecked())
                {
                    Toast.makeText(Radiobutton.this,"Male",Toast.LENGTH_LONG).show();
                }
                else
                    {
                        Toast.makeText(Radiobutton.this,"Female",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}