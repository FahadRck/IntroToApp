package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView1=findViewById(R.id.text1);
        textView2=findViewById(R.id.text2);
        textView3=findViewById(R.id.text3);

        Intent intent=getIntent();
      String name=  intent.getStringExtra("edit1");
       int num= intent.getIntExtra("edit2",0);
        String radioData= intent.getStringExtra("rd1");

        textView1.setText(radioData);
        textView2.setText(num+""); textView3.setText(name);
    }
}