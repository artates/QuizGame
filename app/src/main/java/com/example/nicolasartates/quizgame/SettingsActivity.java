package com.example.nicolasartates.quizgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    Button button_sound;
    Boolean sound = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        button_sound = (Button)findViewById(R.id.button_play);

        button_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound ^= true;

            }
        });
    }
    public boolean setSound(Boolean s)
    {
        return s;
    }
    public void callSound(Boolean s)
    {

    }

}
