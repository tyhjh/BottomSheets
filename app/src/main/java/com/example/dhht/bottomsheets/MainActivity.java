package com.example.dhht.bottomsheets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_hello = findViewById(R.id.btn_hello);
    }


    @Override
    protected void onStart() {
        super.onStart();



    }
}
