package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkboxes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes);
        CheckBox ckb=(CheckBox)findViewById(R.id.ckb1);
        ckb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ckb.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Checkbox is checked",Toast.LENGTH_LONG).show();
                }
                else
                    {
                        Toast.makeText(getApplicationContext(),"Checkbox is Unchecked",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}