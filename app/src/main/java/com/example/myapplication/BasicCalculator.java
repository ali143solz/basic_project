package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BasicCalculator extends AppCompatActivity {
public String str="";
Character operator='q';
double i, num,numtemp;
EditText showresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);
        showresult=(EditText) findViewById(R.id.result);

    }
    private void insert(int j)
    {
        str=str+Integer.toString(j);
        num=Integer.valueOf(str).intValue();
        showresult.setText(str);
    }
    private void reset()
    {
        str="";
        operator='q';
        num=0;
        numtemp=0;
        showresult.setText("");
    }
    public void perform()
    {
        str="";
        numtemp=num;
    }
    public void calculate()
    {
        if(operator=='+')
        {
         num = numtemp+num;
        }
        if(operator=='-')
        {
            num = numtemp-num;

        }
        if(operator=='*')
        {
            num = numtemp*num;
        }
        if(operator=='/')
        {
            num = numtemp/num;
        }
        showresult.setText(""+num);
    }

    public void btn7Clicked(View view) {

        int j;

        insert(7);
    }

    public void btn8Clicked(View view) {
        int j;
        insert(8);
    }

    public void btn9Clicked(View view) {
        int j;
        insert(9);
    }

    public void btnclearClicked(View view) {
        reset();
    }

    public void btn4Clicked(View view) {
        int j;
        insert(4);
    }

    public void btn5Clicked(View view) {
        int j;
        insert(5);
    }

    public void btn6Clicked(View view) {
        int j;
        insert(6);
    }

    public void btnpClicked(View view) {
        perform();
        operator='+';
    }

    public void btn1Clicked(View view) {
        int j;
        insert(1);
    }

    public void btn2Clicked(View view) {
        int j;
        insert(2);
    }

    public void btn3Clicked(View view) {
        int j;
        insert(3);
    }

    public void btnmClicked(View view) {
        perform();
        operator='-';
    }

    public void btnisClicked(View view) {
     calculate();
    }

    public void btndivClicked(View view) {
        perform();
        operator='/';
    }

    public void btn0Clicked(View view) {
        int j;
        insert(0);
    }

    public void btnmulClicked(View view) {
        perform();
        operator='*';
    }
}