package com.example.test;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

public class infoScreen2 extends AppCompatActivity {
    EditText height, weight, country, City, userN;
    Button Finish;
    ImageView male2, female2;
    Slider heightS, weightS;

    TextView missingF;

    public String nameE="";
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_screen2);

        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        country=(EditText) findViewById(R.id.country);
        City=(EditText) findViewById(R.id.city);
        Finish=(Button) findViewById(R.id.finishBt);
        male2=(ImageView) findViewById(R.id.male2);
        female2=(ImageView) findViewById(R.id.female2);
        heightS=(Slider) findViewById(R.id.slider1height);
        weightS=(Slider) findViewById(R.id.slider2weight);
        userN= (EditText) findViewById(R.id.userName2);
        missingF =(TextView) findViewById(R.id.missingFields2) ;

        userN.setBackgroundResource(android.R.color.transparent);

        Bundle incomingMessages = getIntent().getExtras();

        if(incomingMessages!=null)
        {
            nameE = incomingMessages.getString("name");
        }


        if(!(MainActivity.Users.isEmpty()))
        {
            userN.setText("Tell us more about yourself "+nameE);
        }
        if(infoScreen1.State){
            male2.setVisibility(View.VISIBLE);
            female2.setVisibility(View.INVISIBLE);
        }
        else{
            male2.setVisibility(View.INVISIBLE);
            female2.setVisibility(View.VISIBLE);

        }
        Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Math.signum(heightS.getValue()) == 0  || country.getText().toString().equals("") || City.getText().toString().equals("") || Math.signum(weightS.getValue()) == 0)
                {
                    missingF.setText("Some Data Fields Are Missing");
                    missingF.setTextColor(Color.RED);
                    missingF.setVisibility(View.VISIBLE);
                }
                else
                 Saving();

            }
        });
       weightS.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
           @Override
           public void onStartTrackingTouch(@NonNull Slider slider) {
               Float tmp=weightS.getValue();

               weight.setText(tmp.toString()+" Kg");
           }

           @Override
           public void onStopTrackingTouch(@NonNull Slider slider) {
               Float tmp=weightS.getValue();


               weight.setText(tmp.toString()+" Kg");

           }
       });
       heightS.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
           @Override
           public void onStartTrackingTouch(@NonNull Slider slider) {
               Float tmp=heightS.getValue();
               height.setText(tmp.toString()+" Cm");
           }

           @Override
           public void onStopTrackingTouch(@NonNull Slider slider) {
               Float tmp=heightS.getValue();
               height.setText(tmp.toString()+" Cm");

           }
       });



    }
    public void Saving(){

        MainActivity.Users.get(MainActivity.cnt).addData2(heightS.getValue(), weightS.getValue(), country.getText().toString(), City.getText().toString());
//        MainActivity.Users.get(MainActivity.cnt).City=City.getText().toString();
//        MainActivity.Users.get(MainActivity.cnt).Country=country.getText().toString();
//        MainActivity.Users.get(MainActivity.cnt).height=heightS.getValue();
//        MainActivity.Users.get(MainActivity.cnt).weight=weightS.getValue();
        Intent I = new Intent(this,finishedRegActivity.class);
        I.putExtra("name", nameE);
        I.putExtra("weight", weightS.getValue());
        I.putExtra("height", heightS.getValue());
        startActivity(I);




    }
}