package com.example.test;
//import com.example.test.DaoClass.Daoclass;
//import com.example.test.EntityClass.DataBaseClass.*;
//import com.example.test.EntityClass.*;

//import androidx.appcompat.app.app/CompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.room.Room.*;
//import androidx.room.RoomDatabase.*;

//import com.example.test.EntityClass.DataBaseClass;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public EditText NameBox;
    public EditText PassBox;
    private TextView Status;
    private Button Login;
    private Button register;
    private Button show;
    static public Integer cnt=-1;

   public static List<Patient> Users;
   static  List<Disease> Disease_Data;
    public static List<Patient> userdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Users=new ArrayList<>();
        Disease_Data =new ArrayList<>();
        NameBox =(EditText)findViewById(R.id.etUserName);
        PassBox =(EditText)findViewById(R.id.etPassword);
       Login=(Button) findViewById(R.id.loginBTN);
        register=(Button) findViewById(R.id.registerBTN);
        show=(Button) findViewById(R.id.show);
       Status=(TextView) findViewById(R.id.textView2);

//       userdata. = DataBaseClass.getDatabase(getApplicationContext()).getDao().getAllData());

       //if user already exists then send him straight to the symptoms page
       Login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Logging(NameBox.getText().toString(), PassBox.getText().toString());
           }
       });

       register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               registering(NameBox.getText().toString(), PassBox.getText().toString());
           }
       });


       show.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });


    }
    public void Logging(String UserN, String UserP){
        boolean x=false;
        if(UserN.equals("admin")&&UserP.equals("admin")){                             // if admin, it launches Adminstration Page
            Intent I =new Intent(MainActivity.this,MainActivity2.class);
            startActivity(I);
            Toast.makeText(this, "ADMIN LOGGED IN", Toast.LENGTH_LONG).show();
        }
        else for(int i=0;i<Users.size();i++){
            if(UserN.equals(Users.get(i).UserN)&&UserP.equals(Users.get(i).UserP))    //else checks if the user already exists
            {
                x=true;
                getIndex(UserN,UserP);
                break;
            }
        else
            x=false;
        }
        if(x){
            Intent I =new Intent(MainActivity.this,choosing.class);
            I.putExtra("name", UserN);
            startActivity(I);
        }else if(!x && !(UserN.equals("admin")))
        {Status.setText("Wrong User Name or Password");}
    }
    public void registering(String UserN,String UserP){
        boolean X=true;
        if(UserN.equals("")|| UserP.equals(""))
        {
            Status.setText("Please enter a username and a password to Register"); // IF the username and the password are empty the user should be asked to enter them again to be able to register
            X=false;

        }
        else{


        for(int i=0;i<Users.size()&&Users.size()!=0;i++){
            if(UserN.equals(Users.get(i).UserN)){
                Status.setText("User already exist, Please Login");
                X=false;
                break;
            }

            else X=true;
        }

        if(X){

        Patient tmp=new Patient(UserN,UserP);
        Users.add(tmp);
        Status.setText("Registered successfully");
        cnt=Users.size()-1;
        Intent i = new Intent(this, infoScreen1.class);
            i.putExtra("name", UserN);
            i.putExtra("password", UserP);
        startActivity(i);
        }

    }
    }
    public void getIndex(String UserN,String UserP){
        for(int i=0;i<Users.size()&&Users.size()!=0;i++){
            if(UserN.equals(Users.get(i).UserN)&&UserP.equals(Users.get(i).UserP)){
                cnt=i;
            }


        }

    }

//    private void saveDataDB()
//    {
//        String UN_text = Users.get(cnt).UserN.toString();
//        String PW_text = Users.get(cnt).UserP.toString();
//
//        if(UN_text!= null && PW_text!= null )
//        {
//            RoomDataB data1 = new RoomDataB(UN_text, PW_text);
//            DataBaseClass.getDatabase(getApplicationContext()).getDao().insertallData(data1);
//            Toast.makeText(this, "saved data", Toast.LENGTH_LONG).show();
//        }
//    }


}