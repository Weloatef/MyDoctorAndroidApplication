package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    EditText Disease1;
    EditText Symp1 ;
    EditText Symp2 ;
    EditText Symp3 ;
    EditText Symp4 ;
    EditText Severity;
    EditText Medicine;
    EditText MedicineDosage;
    Switch Infectious;


    Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        Infectious=(Switch)findViewById(R.id.switch1) ;
        Severity=(EditText)findViewById(R.id.Severity);
        Medicine=(EditText)findViewById(R.id.Medicine1);
        MedicineDosage=(EditText)findViewById(R.id.MedicineDos);
        Disease1=(EditText)findViewById(R.id.AddDisease) ;
        Symp1=(EditText) findViewById(R.id.Symp1);
        Symp2=(EditText) findViewById((R.id.Symp2));
        Symp3=(EditText) findViewById((R.id.Symp3));
        Symp4=(EditText) findViewById((R.id.Symp4));
        Add=(Button)findViewById(R.id.ADD);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AddingSymp();
                AddingDisease();


            }
        });
    }
    public void AddingSymp(){
        MainActivity3.Symptoms.add(Symp1.getText().toString());
        MainActivity3.Symptoms.add(Symp2.getText().toString());
        MainActivity3.Symptoms.add(Symp3.getText().toString());
        MainActivity3.Symptoms.add(Symp4.getText().toString());
        Toast.makeText(this, "Added Successfully", Toast.LENGTH_LONG).show();
    }
    public void AddingDisease(){
        List<String> Tmp=new ArrayList<>();
        com.example.test.Medicine MM=new Medicine(Medicine.getText().toString(),MedicineDosage.getText().toString());
        Tmp.add(Symp1.getText().toString());
        Tmp.add(Symp2.getText().toString());
        Tmp.add(Symp3.getText().toString());
        Tmp.add(Symp4.getText().toString());

        Disease Dtmp=new Disease(Disease1.getText().toString(),Infectious.isChecked(),Tmp,Severity.getText().toString(),MM);
        MainActivity.Disease_Data.add(Dtmp);
        Toast.makeText(this, "Added Successfully", Toast.LENGTH_LONG).show();


    }
}