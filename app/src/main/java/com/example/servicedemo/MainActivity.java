package com.example.servicedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.commonlibrary.IStartMainContainer;
import com.example.commonlibrary.services.Services;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Services.load(IStartMainContainer.class).startMainActivity(this);
    }
}
