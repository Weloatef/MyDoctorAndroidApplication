package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class choosing extends AppCompatActivity {
    Button logout;
    ImageButton checkup;
    ImageButton manager;
    TextView welcback;
    public  String nameE="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing);
        getSupportActionBar().hide();
        logout=(Button) findViewById(R.id.logoutBT);
        checkup=(ImageButton) findViewById(R.id.checkupBt);
        manager=(ImageButton) findViewById(R.id.managerBT);
        welcback=(TextView) findViewById(R.id.wback);
        Bundle incomingMessages = getIntent().getExtras();

        if(incomingMessages!=null)
        {
            nameE = incomingMessages.getString("name");
            welcback.setText("Welcome Back "+nameE+"!!"+" We Hope You Are Doing Well");
        }
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();

            }
        });
        checkup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkup();
            }
        });

    }
    public void logout(){
        Intent I= new Intent(this,MainActivity.class);
        startActivity(I);

    }
    public void checkup(){
        Intent I= new Intent(this,MainActivity3.class);
        startActivity(I);

    }

    public void medsManager(View v)
    {
        Intent I = new Intent(this, medsManagerMain.class);
        startActivity(I);
    }

    



}