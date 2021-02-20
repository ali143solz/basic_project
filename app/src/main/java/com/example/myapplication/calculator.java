package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity implements View.OnClickListener{
    EditText editfirst,editsec;
    TextView tvresult;
    Button btnadd,btnmin,btnmul,btndiv;
    int counter=0;
    String TAG="Testing";
    float first, sec,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
         editfirst = (EditText) findViewById(R.id.editfirst);
         editsec=(EditText) findViewById(R.id.editsec);
         btnadd=(Button) findViewById(R.id.btnadd);
         btnmin=(Button) findViewById(R.id.btnmin);
         btnmul=(Button) findViewById(R.id.btnmul);
         btndiv=(Button) findViewById(R.id.btndiv);
         tvresult=(TextView) findViewById(R.id.tvresult);

//         btnadd.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
//                 float first, sec,result;
//                 first=Integer.valueOf(editfirst.getText().toString());
//                 sec=Integer.valueOf(editsec.getText().toString());
//                 result=first+sec;
//                 tvresult.setText("Your Result is"+result);
//             }
//
//         });
//        btnmin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                float first, sec,result;
//                first=Integer.valueOf(editfirst.getText().toString());
//                sec=Integer.valueOf(editsec.getText().toString());
//                result=first-sec;
//                tvresult.setText("Your Result is"+result);
//            }
//
//        });
    btnadd.setOnClickListener(this);
    btnmin.setOnClickListener(this);
    btnmul.setOnClickListener(this);
    btndiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnadd:

                first=Integer.valueOf(editfirst.getText().toString());
                sec=Integer.valueOf(editsec.getText().toString());
                result=first+sec;
                tvresult.setText("Your Result is"+result);
                break;

            case R.id.btnmin:
                first=Integer.valueOf(editfirst.getText().toString());
                sec=Integer.valueOf(editsec.getText().toString());
                result=first-sec;
                tvresult.setText("Your Result is"+result);
                break;

            case R.id.btnmul:
                first=Integer.valueOf(editfirst.getText().toString());
                sec=Integer.valueOf(editsec.getText().toString());
                result=first*sec;
                tvresult.setText("Your Result is"+result);
                break;

            case R.id.btndiv:
                first=Integer.valueOf(editfirst.getText().toString());
                sec=Integer.valueOf(editsec.getText().toString());
                result=first/sec;
                tvresult.setText("Your Result is"+result);
                break;
        }
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        log.i(TAG,"onnStart");
//    }
//    protected void onResume()
//    {
//        super.onResume();
//        log.i(TAG,"onnStart");
//    }
//    @Override
//    protected void onPause() {
//        super.onPause();
//        log.i(TAG,"onnStart");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        log.i(TAG,"onnStart");
//    }
}