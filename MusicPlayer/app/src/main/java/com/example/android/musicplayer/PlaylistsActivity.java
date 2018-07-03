package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
    }
    public void pl1(View view)
    {
        Intent pl1 = new Intent(this,PlaylistoneActivity.class);
        startActivity(pl1);
    }
    public void pl2(View view)
    {
        Toast.makeText(getApplicationContext(),"No songs",Toast.LENGTH_SHORT).show();
    }
    public void pl3(View view)
    {
        Toast.makeText(getApplicationContext(),"No songs",Toast.LENGTH_SHORT).show();
    }
    public void pl4(View view)
    {
        Toast.makeText(getApplicationContext(),"No songs",Toast.LENGTH_SHORT).show();
    }
    public void pl5(View view)
    {
        Toast.makeText(getApplicationContext(),"No songs",Toast.LENGTH_SHORT).show();
    }
    public void pl6(View view)
    {
        Toast.makeText(getApplicationContext(),"No songs",Toast.LENGTH_SHORT).show();
    }
}
