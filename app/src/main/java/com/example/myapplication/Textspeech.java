package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Textspeech extends AppCompatActivity  implements TextToSpeech.OnInitListener {
    private TextToSpeech tts;
    private Button btn1;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textspeech);
        tts = new TextToSpeech(this, this);
        btn1 = (Button) findViewById(R.id.btn1);
        editText = (EditText) findViewById(R.id.editText);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakOut();

            }
        });
    }
    public void onDestory()
    {
        //Don't forget to shutdown tts!
        if(tts !=null)
        {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    @Override
    public void onInit(int status)
    {
        if (status == TextToSpeech.SUCCESS)
        {
            int result = tts.setLanguage(Locale.US);
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("tts", "This Language IS Not Supported");
            } else {
                btn1.setEnabled(true);
                speakOut();
            }
        }
        else
        {
            Log.e("tts","Initilization Failed");
        }
    }

    private void speakOut()
    {
        String text = editText.getText().toString();
        tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
    }
}