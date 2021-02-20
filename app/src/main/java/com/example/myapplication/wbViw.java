package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class wbViw extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wb_viw);
        wv=(WebView)findViewById(R.id.wv);
        String  Webdata ="<html><body><h1>Ali Khan</h1><h2>Ali Khan</h2><h3>Ali Khan</h3><h4>Ali Khan</h4><h5>Ali Khan</h5><h6>Ali Khan</h6></body></html>";
        wv.loadData(Webdata,"text/html","UTF-8");
       /* wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://ali143solz.github.io/");*/
    }
}