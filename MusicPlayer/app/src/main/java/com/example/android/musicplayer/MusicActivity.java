package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }

    public void details(View view)
    {
        Toast.makeText(getApplicationContext(),"Details",Toast.LENGTH_SHORT).show();
    }
    public void playMusic(View view)
    {
        Intent pm = new Intent(this, PlayActivity.class);
        startActivity(pm);
    }
}
