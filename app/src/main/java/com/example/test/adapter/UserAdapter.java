


// >>>>>>>>>>>>>>>>>>>>>PLEASE READ<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// ->> WE WERE GOING TO USE ROOM DATABASE (WHICH PROVIDES AN ABSTRACTION LAYER OVER SQL LITE)
// ->>TO STORE THE DATA TAKEN FROM THE USER (WHICH IS INITIALLY STORED IN AN ARRAY LIST WHILE THE APP IS RUNNING)
// ->> AND RELOAD IT WHEN THE USER CLOSES AND OPENS THE APP, HOWEVER WE COULDN'T FINISH IT IN TIME AND TEST IT
// ->> SO THE COMMENTED FILES (UserAdapter), (DaoClass), (DataBaseClass), (RoomDataB) ARE ALL PART OF THE DATABASE SO WE
// ->> WE COMMENTED THEM AND LEFT THEN IN THE PROJECT FILES IN CASE WE DECIDED TO COMPLETE THE DATABASE LATER








//package com.example.test.adapter;
//
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.test.EntityClass.DataBaseClass;
//import com.example.test.EntityClass.RoomDataB;
//import com.example.test.R;
//
//import java.util.List;
//
//public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
//    Context context;
//    List<RoomDataB> list;
//
//    public UserAdapter(Context context, List<RoomDataB> list) {
//        this.context = context;
//        this.list = list;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent, false));
//    }
//
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//          holder.nametxt.setText(list.get(position).getUsername());
//          holder.password.setText(list.get(position).getPassword());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return list.size();
//    }
//
//    class ViewHolder extends RecyclerView.ViewHolder {
//
//        TextView nametxt, password;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            nametxt = itemView.findViewById(R.id.etUserName);
//            password = itemView.findViewById(R.id.etPassword);
//        }
//    }
//
//}