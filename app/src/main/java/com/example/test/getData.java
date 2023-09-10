

// >>>>>>>>>>>>>>>>>>>>>PLEASE READ<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// ->> WE WERE GOING TO USE ROOM DATABASE (WHICH PROVIDES AN ABSTRACTION LAYER OVER SQL LITE)
// ->>TO STORE THE DATA TAKEN FROM THE USER (WHICH IS INITIALLY STORED IN AN ARRAY LIST WHILE THE APP IS RUNNING)
// ->> AND RELOAD IT WHEN THE USER CLOSES AND OPENS THE APP, HOWEVER WE COULDN'T FINISH IT IN TIME AND TEST IT
// ->> SO THE COMMENTED FILES (UserAdapter), (DaoClass), (DataBaseClass), (RoomDataB) ARE ALL PART OF THE DATABASE SO WE
// ->> WE COMMENTED THEM AND LEFT THEN IN THE PROJECT FILES IN CASE WE DECIDED TO COMPLETE THE DATABASE LATER



//package com.example.test;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.os.Bundle;
//
//import com.example.test.Adapter.UserAdapter;
//import com.example.test.EntityClass.DataBaseClass;
//import com.example.test.EntityClass.RoomDataB;
//import com.example.test.R;
//import com.example.test.adapter.UserAdapter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GetData extends AppCompatActivity {
//
//
//    RecyclerView recyclerview;
//
//    private List<RoomDataB> list;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_get_data);
//        recyclerview = (RecyclerView) findViewById(R.id.);
//        getData();
//
//    }
//
//    private void getData()
//    {
//        recyclerview.setAdapter(new UserAdapter(getApplicationContext(), DataBaseClass.getDatabase(getApplicationContext()).getDao().getAllData()))
//    }
//}