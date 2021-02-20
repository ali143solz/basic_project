package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Calendar;

public class Alarm extends AppCompatActivity {
 TimePicker alarmTimepicker;
 PendingIntent pendingIntent;
 AlarmManager alarmManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        alarmTimepicker=(TimePicker) findViewById(R.id.timepicker);
        alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);
    }

    public void OnToggleClicked(View view) {
        long time;
        if (((ToggleButton)view).isChecked())
        {
            Toast.makeText(Alarm.this,"ALRAM ON",Toast.LENGTH_SHORT).show();
            Calendar calendar=Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY,alarmTimepicker.getCurrentHour());
            calendar.set(Calendar.MINUTE,alarmTimepicker.getCurrentMinute());
            Intent intent=new Intent(this,AlramReceiver.class);
            pendingIntent=PendingIntent.getBroadcast(this,0,intent,0);
            time=(calendar.getTimeInMillis()-(calendar.getTimeInMillis()%60000));
            if (calendar.AM_PM==0)
            {
                time=time+(1000*60*60*12);
            }
            else
            {
                time=time+(1000*60*60*24);
            }
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,time,1000,pendingIntent);
        }
        else
        {
            alarmManager.cancel(pendingIntent);
            Toast.makeText(Alarm.this,"ALARM OFF",Toast.LENGTH_SHORT).show();
        }
    }
}