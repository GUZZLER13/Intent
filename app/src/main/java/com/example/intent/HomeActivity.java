package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);


        Intent intent = getIntent();
        String string = intent.getStringExtra("text1");

        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_LONG).show();


    }
}