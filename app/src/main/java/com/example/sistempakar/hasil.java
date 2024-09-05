package com.example.sistempakar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class hasil extends AppCompatActivity {
    TextView hasil,penyakit,penanganan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Intent i = getIntent();

        final MediaPlayer mf = MediaPlayer.create(this, R.raw.btnmenu);


        hasil=findViewById(R.id.hasil);
        penyakit=findViewById(R.id.hasil2);
        penanganan=findViewById(R.id.hasil3);
        hasil.setText("Hasil : "+i.getExtras().getString("hasil")+"%");
        penyakit.setText("kesimpulan : "+i.getExtras().getString("penyakit"));
        penanganan.setText("penjelasan : "+i.getExtras().getString("penanganan"));
        Button btn=findViewById(R.id.back1);
        btn.setOnClickListener(v -> {
            mf.seekTo(0);
            mf.start();
            startActivity(new Intent(hasil.this, MainActivity.class));
        });

    }
}