package com.example.sistempakar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.btnmenu);

        Button btn = findViewById(R.id.btn_diagnosa);
        btn.setOnClickListener(v -> {
            mp.seekTo(0);
            mp.start();
            Intent intent = new Intent(MainActivity.this, diagnosa.class);
            startActivity(intent);            });

        Button btn2 = findViewById(R.id.btn_jenis);
        btn2.setOnClickListener(v -> {
            mp.seekTo(0);
            mp.start();
            Intent intent = new Intent(MainActivity.this, Jenis.class);
            startActivity(intent);            });
    }
}