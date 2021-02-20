package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class musicb extends AppCompatActivity {
 ImageView play;
 MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicb);
        play=(ImageView) findViewById(R.id.play);
        mediaplayer=MediaPlayer.create(getApplicationContext(),R.raw.kaudio);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if(mediaplayer.isPlaying())
           {
               mediaplayer.pause();
               play.setImageResource(R.drawable.play);
           }
           else {
               mediaplayer.start();
               play.setImageResource(R.drawable.stop);
           }
            }
        });
        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
            mediaplayer.release();
            }
        });
    }
}