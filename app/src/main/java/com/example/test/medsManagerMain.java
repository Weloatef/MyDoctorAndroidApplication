package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.util.Calendar;


public class medsManagerMain extends AppCompatActivity
{

    public ImageView medsBTN, backBTN, addBTN;
    public TextView selectedT;
    private MaterialTimePicker picker;
    private Calendar calendar;
    private AlarmManager alarmManager;
    private PendingIntent pendingIntent;
    private CalendarView calV;
    Button setA ,cancA;

//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meds_manager_main);
        medsBTN = (ImageView) findViewById(R.id.meds);
        backBTN = (ImageView) findViewById(R.id.backB);
        addBTN = (ImageView) findViewById(R.id.addReminderMed);
        selectedT = (TextView) findViewById(R.id.selectedTime);
        setA = (Button) findViewById(R.id.setALARM);
        cancA = (Button) findViewById(R.id.cancAlarm);
        calV = (CalendarView)findViewById(R.id.calendarView);
        createNotificationChannel();
        calV.setVisibility(View.INVISIBLE);
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showTime();

            }
        });

        try{setA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setAlarm();

            }
        });}catch (Exception e){Toast.makeText(this, "YOU HAVE TO CHOOSE A TIME FIRST THEN SET ALARM", Toast.LENGTH_LONG).show();}

        cancA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cancelAlarm();

            }

        });

        addBTN.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                longpress(v);
                return true;
            }
        });
    }
    private void showTime() {
            picker = new MaterialTimePicker.Builder()
                    .setTimeFormat(TimeFormat.CLOCK_12H)
                    .setHour(12)
                    .setMinute(0)
                    .setTitleText("Select Alarm Time")
                    .build();
            picker.show(getSupportFragmentManager(), "MyDoc");
            picker.addOnPositiveButtonClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (picker.getHour() > 12) {
                        selectedT.setText(
                                String.format("%02d", (picker.getHour() - 12)) + " : " + String.format("%02d", picker.getMinute()) + " PM");
                    } else {
                        selectedT.setText(picker.getHour() + " : " + picker.getMinute() + " AM");
                    }
                    calendar = Calendar.getInstance();
                    calendar.set(Calendar.HOUR_OF_DAY, picker.getHour());
                    calendar.set(Calendar.MINUTE, picker.getMinute());
                    calendar.set(Calendar.SECOND, 0);
                    calendar.set(Calendar.MILLISECOND, 0);

                }

            });
        }

    public void setAlarm()
    {
        alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, AlarmReciever.class);
        pendingIntent = PendingIntent.getBroadcast(this, 0, intent,0);
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);
        Toast.makeText(this, "Reminder set", Toast.LENGTH_LONG).show();
    }



    public void cancelAlarm()
    {
        Intent intent = new Intent(this, AlarmReciever.class);
        pendingIntent = PendingIntent.getBroadcast(this, 0, intent,0);
        if(alarmManager == null)
        {
            alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        }
        alarmManager.cancel(pendingIntent);
        Toast.makeText(this, "Reminder Cancelled", Toast.LENGTH_LONG).show();
    }

    private void createNotificationChannel()
    {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            CharSequence name = "MEDS REMINDER";
            String description = "STAY HYDRATED";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("MyDOC", name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void longpress(View view)
    {
        if(calV.VISIBLE == 0)
        {
            calV.setVisibility(view.VISIBLE);
        }
        else if(calV.VISIBLE == 1)
        {
            calV.setVisibility(view.INVISIBLE);
        }
    }
    String[] quotes = new String[] { "EAT CLEAN :)", "STAY HYDRATED ^-^", "STAY ACTIVE :D", "EXERCISE DAILY :)", "HEALTH IS NOT VALUED TILL SICKNESS COMES",
    "THE GREATEST WEALTH IS HEALTH", "LOVE YOURSELF ENOUGH TO LIVE A HEALTHY LIFESTYLE", "YOUR HEALTH IS AN INVESTMENT NOT AN EXPENSE", "HEALTH ISN'T A GOAL IT'S A WAY OF LIVING",
            "TAKE CARE OF YOUR BODY AND IT WILL TAKE CARE OF YOU :)", "GOOD HEALTH IS THE GREATEST GIFT"};


    public void Hquotes(View view)
    {
        int r= getRandomNumber(0, 10);
        Toast.makeText(this, quotes[r], Toast.LENGTH_SHORT).show();
    }

    public void home(View view)
    {
        Intent I = new Intent(this, choosing.class);
        startActivity(I);

    }

}