package com.example.vikashkumar.web;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mywebview =(WebView) findViewById(R.id.WebView);
        mywebview.loadUrl("https//wwww.google.com/");
    }
}
