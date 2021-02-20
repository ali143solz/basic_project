package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class istactivity extends AppCompatActivity {
  EditText edtfstname,edtlastname;
  Button btnnxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istactivity);
       edtfstname=(EditText)findViewById(R.id.fstname);
       edtlastname=(EditText)findViewById(R.id.secname);
       btnnxt=(Button)findViewById(R.id.btnnext);
       btnnxt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String firstname=edtfstname.getText().toString();
               String Lastname=edtlastname.getText().toString();
               Intent it=new Intent(istactivity.this,secactivity.class);
               it.putExtra("firstname",firstname);
               it.putExtra("lastname",Lastname);
               startActivity(it);

           }
       });

    }
}