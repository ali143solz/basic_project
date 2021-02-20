package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ifelse extends AppCompatActivity {
   Button btnclick;
        TextView tv;
        EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifelse);
        btnclick=(Button) findViewById(R.id.btnclick);
        tv=(TextView) findViewById(R.id.tv);
        edt=(EditText) findViewById(R.id.edt);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String option=edt.getText().toString();
                if(option.equals("pass"))
                {
                    tv.setText("You are PASS");
                }
                else if(option.equals("Fail"))
                {
                    tv.setText("You are FAIL");
                }
                else
                {
                    tv.setText("Wrong Entry");
                }
            }
        });
//        tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        edt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }
}