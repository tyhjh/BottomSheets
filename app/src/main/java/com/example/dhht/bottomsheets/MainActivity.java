package com.example.dhht.bottomsheets;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.bottomsheet.BottomFragment;
import com.example.bottomsheet.MyDialog;


public class MainActivity extends AppCompatActivity {

    Button btn_hello,btn_hello2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_hello = findViewById(R.id.btn_hello);
        btn_hello2 = findViewById(R.id.btn_hello2);
    }


    @Override
    protected void onStart() {
        super.onStart();
        btn_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.ic_launcher_background);
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(MainActivity.this);
                bottomSheetDialog.setContentView(imageView);
                bottomSheetDialog.show();


                /*BottomFragment fragment=new BottomFragment();
                fragment.setView(imageView);
                fragment.show(getFragmentManager(),"tag");*/

            }
        });

        btn_hello2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view=LayoutInflater.from(MainActivity.this).inflate(R.layout.bottomsheet,null);
                BottomFragment fragment=new BottomFragment();
                fragment.setView(view);
                fragment.setBackgroundDim(false);
                fragment.show(getFragmentManager(),"tag");

            }
        });


    }
}
