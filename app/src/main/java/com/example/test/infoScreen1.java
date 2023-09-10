package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class infoScreen1 extends AppCompatActivity {
    EditText age, mail, Number, userN, name;
    Button Next;
    RadioButton male, female;
    ImageView maleI, femaleI;
    TextView missingF;

    static public boolean State=true;

    public String nameE="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_screen1);
        userN= (EditText) (findViewById(R.id.userName));
        userN.setBackgroundResource(android.R.color.transparent);
        Bundle incomingMessages = getIntent().getExtras();
        if(incomingMessages!=null)
        {
            nameE = incomingMessages.getString("name");
        }


        if(!(MainActivity.Users.isEmpty()))
        {
            userN.setText("Greetings "+nameE+"!  Please Register Your Info:");
        }
        name=(EditText) findViewById(R.id.patientName);
        age=(EditText) findViewById(R.id.ageIF1);
       mail=(EditText) findViewById(R.id.mailIF1);
        Number=(EditText) findViewById(R.id.phoneNumIF1);
        Next=(Button) findViewById(R.id.Nxtif1);
        male=(RadioButton) findViewById(R.id.radiomaleif1);
       female=(RadioButton) findViewById(R.id.radiofemaleif1);
        maleI=(ImageView)findViewById(R.id.male);
        femaleI=(ImageView)findViewById(R.id.female);
        missingF =(TextView) findViewById(R.id.missingFields) ;
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(male.isChecked()){
                    maleI.setVisibility(View.VISIBLE);
                    femaleI.setVisibility(View.INVISIBLE);
                    female.setChecked(false);
                    State=true;

                }
            }
        });

       female.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(female.isChecked()){
                   maleI.setVisibility(View.INVISIBLE);
                   femaleI.setVisibility(View.VISIBLE);
                   male.setChecked(false);
                   State=false;
               }
           }
       });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("") || age.getText().toString().equals("") || mail.getText().toString().equals("") || Number.getText().toString().equals("") || (male.isChecked() == false && female.isChecked() == false))
                {
                    missingF.setText("Some Data Fields Are Missing");
                    missingF.setTextColor(Color.RED);
                    missingF.setVisibility(View.VISIBLE);
                }
                else
                Saving();

            }
        });

    }
    public void Saving(){
        String gender = "";

        if(male.isChecked()){
           gender="Male";
        }
        else if(female.isChecked()) {
            gender = "Female";
        }
        MainActivity.Users.get(MainActivity.Users.size()-1).addData1(name.toString(), age.toString(), gender.toString(), mail.toString(), Number.toString());

        Intent I=new Intent(this,infoScreen2.class);
        I.putExtra("name", nameE);
        startActivity(I);
    }
}