package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class firstlec extends AppCompatActivity {
 //EditText is a class xml m is ko use kia hai
    //edittext1 is obj of class
    //method and functions are same
    EditText edittext,edittext1;
    //Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstlec);
    }
    public void SMS(){
        //btn k against id search krna. R.java ka folder hota hai jo link krta hai xml ko java k sath
        //btn=(Button)findViewById(R.id.b1);
        Button btn=(Button)findViewById(R.id.b1);
       //btn py onclicklistner apply krna hai taky function apply ho
                //new keyword is for dynamic memory k lye
                //View is a class is ko call krny sy method override ho jyn gy
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //EditText edittext=(EditText) findViewById(R.id.t1);
                //EditText edittext1=(EditText) findViewById(R.id.t2);
            //different method t1= edittext is obj of class
                EditText t1= edittext=(EditText) findViewById(R.id.t1);
                EditText t2=edittext1=(EditText) findViewById(R.id.t2);
                // string use for proffessional work
                //getText convert to string
                String ph=t1.getText().toString();
                String sms=t2.getText().toString();
                //android have 7 manager like alram manager,notification manager, phone manager.
                //bydefault
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(ph,null,sms,null,null);
                Toast.makeText(getApplicationContext(),"msg send",Toast.LENGTH_SHORT).show();

                /*Intent i=new Intent(firstlec.this,firstlec.class);
                startActivity(i);*/ //y button ki body m dal dni hai

            }
        });
    }
}