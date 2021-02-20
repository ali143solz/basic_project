package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import java.net.URI;

public class AlramReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Alram! Wake ip!", Toast.LENGTH_LONG).show();
        Uri alramUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        if(alramUri==null)
        {
            alramUri=RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        }
        Ringtone ringtone=RingtoneManager.getRingtone(context,alramUri);
        ringtone.play();
    }
}
