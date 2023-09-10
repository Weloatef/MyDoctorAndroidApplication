


// >>>>>>>>>>>>>>>>>>>>>PLEASE READ<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// ->> WE WERE GOING TO USE ROOM DATABASE (WHICH PROVIDES AN ABSTRACTION LAYER OVER SQL LITE)
// ->>TO STORE THE DATA TAKEN FROM THE USER (WHICH IS INITIALLY STORED IN AN ARRAY LIST WHILE THE APP IS RUNNING)
// ->> AND RELOAD IT WHEN THE USER CLOSES AND OPENS THE APP, HOWEVER WE COULDN'T FINISH IT IN TIME AND TEST IT
// ->> SO THE COMMENTED FILES (UserAdapter), (DaoClass), (DataBaseClass), (RoomDataB) ARE ALL PART OF THE DATABASE SO WE
// ->> WE COMMENTED THEM AND LEFT THEN IN THE PROJECT FILES IN CASE WE DECIDED TO COMPLETE THE DATABASE LATER





//package com.example.test.EntityClass;
//
//import android.arch.persistence.room.ColumnInfo;
//import android.arch.persistence.room.Entity;
//import android.arch.persistence.room.PrimaryKey;
//
//@Entity(tableName = "user")
//public class RoomDataB {
//
//    @PrimaryKey(autoGenerate = true)
//    private int key;
//
//    @ColumnInfo(name = "Username")
//    private String Username;
//
//    @ColumnInfo(name = "Password")
//    private String Password;
//
//    @ColumnInfo(name = "Gender")
//    private String Gender;
//
//    @ColumnInfo(name = "Height")
//    private String Height;
//
//    @ColumnInfo(name = "Weight")
//    private String Weight;
//
//    @ColumnInfo(name = "Age")
//    private String Age;
//
//    public RoomDataB( String username, String password) {
//        Username = username;
//        Password = password;
//    }
//
//    public int getKey() {
//        return key;
//    }
//
//    public void setKey(int key) {
//        this.key = key;
//    }
//
//    public String getUsername() {
//        return Username;
//    }
//
//    public void setUsername(String username) {
//        Username = username;
//    }
//
//    public String getPassword() {
//        return Password;
//    }
//
//    public void setPassword(String password) {
//        Password = password;
//    }
//
//    public String getGender() {
//        return Gender;
//    }
//
//    public void setGender(String gender) {
//        Gender = gender;
//    }
//
//    public String getHeight() {
//        return Height;
//    }
//
//    public void setHeight(String height) {
//        Height = height;
//    }
//
//    public String getWeight() {
//        return Weight;
//    }
//
//    public void setWeight(String weight) {
//        Weight = weight;
//    }
//
//    public String getAge() {
//        return Age;
//    }
//
//    public void setAge(String age) {
//        Age = age;
//    }
//}
