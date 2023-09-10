



// >>>>>>>>>>>>>>>>>>>>>PLEASE READ<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// ->> WE WERE GOING TO USE ROOM DATABASE (WHICH PROVIDES AN ABSTRACTION LAYER OVER SQL LITE)
// ->>TO STORE THE DATA TAKEN FROM THE USER (WHICH IS INITIALLY STORED IN AN ARRAY LIST WHILE THE APP IS RUNNING)
// ->> AND RELOAD IT WHEN THE USER CLOSES AND OPENS THE APP, HOWEVER WE COULDN'T FINISH IT IN TIME AND TEST IT
// ->> SO THE COMMENTED FILES (UserAdapter), (DaoClass), (DataBaseClass), (RoomDataB) ARE ALL PART OF THE DATABASE SO WE
// ->> WE COMMENTED THEM AND LEFT THEN IN THE PROJECT FILES IN CASE WE DECIDED TO COMPLETE THE DATABASE LATER




//package com.example.test.DaoClass;
//
//import android.arch.persistence.room.Dao;
//import android.arch.persistence.room.Insert;
//import android.arch.persistence.room.Query;
//
//import com.example.test.EntityClass.RoomDataB;
//
//import java.util.List;
//
//@Dao
//public interface Daoclass
//{
//    @Insert
//    void insertallData(RoomDataB db1);
//
//    @Query("select * from user")
//    List<RoomDataB> getAllData();
//}
