package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class SecondPlanet extends AppCompatActivity {

    EditText editText1, editText2;
    Button submit;
    RadioButton rd1, rd2;
    String rd;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_planet);

        editText1=findViewById(R.id.first);
        editText2=findViewById(R.id.second);
        rd1=findViewById(R.id.radiobutton);
        rd2=findViewById(R.id.radiobutton2);
        submit=findViewById(R.id.submit);




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String planetName= editText1.getText().toString().trim();
                int numberOfDays= Integer.parseInt(editText2.getText().toString().trim());


                 intent=new Intent(SecondPlanet.this, ThirdActivity.class);
                intent.putExtra("edit1",planetName);
                intent.putExtra("edit2",numberOfDays);
                if(rd1.isChecked()){

                    rd=rd1.getText().toString();
                    intent.putExtra("rd1",rd);
                }else{
                    rd=rd2.getText().toString();
                    intent.putExtra("rd1",rd);
                }
                startActivity(intent);
            }
        });

    }
}