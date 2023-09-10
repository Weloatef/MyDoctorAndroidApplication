


// >>>>>>>>>>>>>>>>>>>>>PLEASE READ<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// ->> WE WERE GOING TO USE ROOM DATABASE (WHICH PROVIDES AN ABSTRACTION LAYER OVER SQL LITE)
// ->>TO STORE THE DATA TAKEN FROM THE USER (WHICH IS INITIALLY STORED IN AN ARRAY LIST WHILE THE APP IS RUNNING)
// ->> AND RELOAD IT WHEN THE USER CLOSES AND OPENS THE APP, HOWEVER WE COULDN'T FINISH IT IN TIME AND TEST IT
// ->> SO THE COMMENTED FILES (UserAdapter), (DaoClass), (DataBaseClass), (RoomDataB) ARE ALL PART OF THE DATABASE SO WE
// ->> WE COMMENTED THEM AND LEFT THEN IN THE PROJECT FILES IN CASE WE DECIDED TO COMPLETE THE DATABASE LATER




//package com.example.test.EntityClass;
//
//import android.arch.persistence.room.Database;
//import android.content.Context;
//
//import androidx.room.Room;
//import androidx.room.RoomDatabase;
//
//import com.example.test.DaoClass.Daoclass;
//
//@Database(entities = {RoomDataB.class}, version = 1)
//public abstract class DataBaseClass extends RoomDatabase
//{
//    public abstract Daoclass   getDao();
//    private static DataBaseClass instance;
//
//
//   public static DataBaseClass getDatabase(final Context context)
//    {
//        if (instance == null)
//        {
//            synchronized (DataBaseClass.class)
//            {
//                instance = Room.databaseBuilder(context, DataBaseClass.class, "DATABASE").allowMainThreadQueries().build();
//            }
//        }
//        return instance;
//    }
//}
