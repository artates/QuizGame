package com.example.nicolasartates.quizgame;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button button_play;

    Boolean sSound = true;

    ImageButton imageButton_settings;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_play = (Button) findViewById(R.id.button_play);
        //button_play.setOnClickListener();

        imageButton_settings = (ImageButton) findViewById(R.id.image);

        imageButton_settings.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {

                Intent settings = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settings);
            }
        });




        final MediaPlayer mp = MediaPlayer.create(this, R.raw.rick);
        button_play.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                if (sSound = true) {
                    mp.start();
                }
                else
                {

                }
                Intent Game = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(Game);
            }
        });
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button_play:
                Intent Game = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(Game);
                break;
            case R.id.image:
                Intent settings = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settings);
                break;


        }



    }

    public void getSound(Boolean s)
    {
        sSound = s;
    }
}
