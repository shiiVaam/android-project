package com.web;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.kosalgeek.android.caching.FileCacher;

import java.io.File;
import java.io.IOException;

public class subactivity extends AppCompatActivity {
    private final String TAG=this.getClass().getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FileCacher<String> fileCacher=new FileCacher<String>(this,"sometext.txt");
        if(fileCacher.hasCache())
        {
            try {
                String text= fileCacher.readCache();
                Log.d(TAG,text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}