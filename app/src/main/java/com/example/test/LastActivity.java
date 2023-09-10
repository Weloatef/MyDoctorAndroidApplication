package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {
    TextView Status;
    Button B;
    ImageView backbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        backbtn = (ImageView)(findViewById(R.id.backB2));

        Status=(TextView) findViewById(R.id.Statusofuser);
        B=(Button) findViewById((R.id.showBT));
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Status.setText(MainActivity.Users.get(MainActivity.cnt).toString());
            }
        });

    }

    public void home(View v)
    {
        Intent i =new Intent(this, choosing.class);
        startActivity(i);
    }
}