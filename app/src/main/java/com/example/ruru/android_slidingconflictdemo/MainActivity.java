package com.example.ruru.android_slidingconflictdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ruru.android_slidingconflictdemo.DifferentDirection.FirstActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void srlAndVp(View v) {
        startActivity(new Intent(this, FirstActivity.class));
    }
}
