package com.example.dhht.bottomsheets;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.bottomsheet.BottomFragment;
import com.example.bottomsheet.MyDialog;


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
        btn_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(MainActivity.this);


                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.ic_launcher_background);
                bottomSheetDialog.setContentView(imageView);
                bottomSheetDialog.show();
                //BottomFragment fragment=new BottomFragment();
                //fragment.setView(imageView);
                //fragment.show(getFragmentManager(),"tag");


            }
        });




    }
}
