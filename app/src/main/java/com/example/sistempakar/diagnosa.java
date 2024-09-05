package com.example.sistempakar;

import static android.widget.Toast.makeText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Set;

public class diagnosa extends AppCompatActivity {
    String a1;
    String p1,p2,p3,p4,p5,p6,p7;
    Button ya, tidak, pertanyaan,sub;
    StringBuffer ok;

    private static String URL_REGIST = "http://192.168.1.5/SISPAK/bayes.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        a1="1";
        Intent i = new Intent(diagnosa.this,MainActivity.class);

        setContentView(R.layout.activity_diagnosa);
        pertanyaan=findViewById(R.id.pertanyaan);
        ya= findViewById(R.id.ya);
        pertanyaan.setText("Tanah memiliki Kandungan pH 7 ?");
        sub=findViewById(R.id.sub);
        tidak= findViewById(R.id.tdk);
        final MediaPlayer mf = MediaPlayer.create(this, R.raw.btnmenu);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.btnya);
        final MediaPlayer td = MediaPlayer.create(this, R.raw.bnttdk);

        ya.setOnClickListener(v -> {
            mp.seekTo(0);
            mp.start();
            switch(a1){

                case "1":
                    pertanyaan.setText("Biota pada tanah terbilang Banyak ?");
                    a1="c1";
                    p1="G01,";
                    break;
                case "b2":
                    pertanyaan.setText("Biota pada tanah terbilang Banyak ?");
                    a1="c1";
                    p1="G02,";
                    break;

                case "b3":
                    pertanyaan.setText("Biota pada tanah terbilang Banyak ?");
                    a1="c1";
                    p1="G03,";
                    break;

                case "b4":
                    pertanyaan.setText("Tanah memiliki Kandungan pH 7 ?");
                    a1="1";
                    break;

                case "c1":
                    pertanyaan.setText("Tanah Memiliki Tekstur Lempung ?");
                    a1="d1";
                    p2=p1+"G04,";
                    break;
                case "c2":
                    pertanyaan.setText("Tanah Memiliki Tekstur Lempung?");
                    a1="d1";
                    p2=p1+"G05,";
                    break;

                case "c3":
                    pertanyaan.setText("Tanah Memiliki Tekstur Lempung ?");
                    a1="d1";
                    p2=p1+"G06,";
                    break;

                case "c4":
                    pertanyaan.setText("Biota pada tanah terbilang Banyak ?");
                    a1="c1";
                    p2=p1;
                    break;

                case "d1":
                    pertanyaan.setText("Struktur Tanah Granular ?");
                    a1="e1";
                    p3=p2+"G07,";
                    break;
                case "d2":
                    pertanyaan.setText("Struktur Tanah Granular ?");
                    a1="e1";
                    p3=p2+"G08,";
                    break;

                case "d3":
                    pertanyaan.setText("Struktur Tanah Granular ?");
                    a1="e1";
                    p3=p2+"G09,";
                    break;

                case "d4":
                    pertanyaan.setText("Tanah Memiliki Tekstur Lempung ?");
                    p3=p2;
                    break;

                case "e1":
                    pertanyaan.setText("Tanah Memiliki Warna Gelap ?");
                    a1="f1";
                    p4=p3+"G10,";
                    break;
                case "e2":
                    pertanyaan.setText("Tanah Memiliki Warna Gelap ?");
                    a1="f1";
                    p4=p3+"G11,";
                    break;

                case "e3":
                    pertanyaan.setText("Tanah Memiliki Warna Gelap ?");
                    a1="f1";
                    p4=p3+"G12,";
                    break;

                case "e4":
                    pertanyaan.setText("Struktur Tanah Granular ?");
                    a1="e1";
                    break;

                case "f1":
                    pertanyaan.setText("Tanah Masih Alami ? ");
                    a1="g1";
                    p5=p4+"G13,";
                    break;
                case "f2":
                    pertanyaan.setText("Tanah Masih Alami ?");
                    a1="g1";
                    p5=p4+"G14,";
                    break;

                case "f3":
                    pertanyaan.setText("Tanah Masih Alami ?");
                    a1="g1";
                    p5=p4+"G15,";
                    break;

                case "f4":
                    pertanyaan.setText("Tanah Memiliki Warna Gelap ?");
                    a1="f1";
                    break;

                case "g1":
                    p6=p5+"G16,";
                    ok =new StringBuffer(p6);
                    ok.deleteCharAt(ok.length()-1);
                    p7= String.valueOf(ok);
                    pertanyaan.setText("MOHON KONFIRMASI");
                    sub.setVisibility(View.VISIBLE);
                    ya.setVisibility(View.GONE);
                    tidak.setVisibility(View.GONE);
                    break;
                case "g2":
                    p6=p5+"G17,";
                    ok =new StringBuffer(p6);
                    ok.deleteCharAt(ok.length()-1);
                    p7= String.valueOf(ok);
                    pertanyaan.setText("MOHON KONFIRMASI");
                    sub.setVisibility(View.VISIBLE);
                    ya.setVisibility(View.GONE);
                    tidak.setVisibility(View.GONE);
                    break;
                case "g3":
                    p6=p5+"G18,";
                    ok =new StringBuffer(p6);
                    ok.deleteCharAt(ok.length()-1);
                    p7= String.valueOf(ok);
                    pertanyaan.setText("MOHON KONFIRMASI");
                    sub.setVisibility(View.VISIBLE);
                    ya.setVisibility(View.GONE);
                    tidak.setVisibility(View.GONE);
                    break;
                case "g4":
                    pertanyaan.setText("Tanah Masih Alami ?");
                    a1="g1";
                    break;

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mf.seekTo(0);
                mf.start();
                Regist();
            }
        });
        tidak.setOnClickListener(view ->  {
            td.seekTo(0);
            td.start();
            switch(a1){

                case "1":
                    pertanyaan.setText("Tanah memiliki Kandungan pH 6,5 ?");
                    a1="b2";
                    break;
                case "b2":
                    pertanyaan.setText("Tanah memiliki Kandungan pH dibawah 6,5 atau lebih dari 7 ?");
                    a1="b3";
                    break;

                case "b3":
                    pertanyaan.setText("Jawaban Tidak Ditemukan Ulangi ?");
                    a1="b4";
                    break;

                case "b4":
                    startActivity(i);
                    break;

                case "c1":
                    pertanyaan.setText("Biota pada tanah terbilang Sedikit ?");
                    a1="c2";
                    break;
                case "c2":
                    pertanyaan.setText("Biota pada tanah terbilang Tidak Ada ?");
                    a1="c3";
                    break;

                case "c3":
                    pertanyaan.setText("Jawaban Tidak Ditemukan Ulangi ?");
                    a1="c4";
                    break;

                case "c4":
                    startActivity(i);
                    break;

                case "d1":
                    pertanyaan.setText("Tanah Memiliki Tekstur Gembur ?");
                    a1="d2";
                    break;
                case "d2":
                    pertanyaan.setText("Tanah Memiliki Tekstur Pasir ?");
                    a1="d3";
                    break;

                case "d3":
                    pertanyaan.setText("Jawaban Tidak Ditemukan Ulangi ?");
                    a1="d4";
                    break;

                case "d4":
                    startActivity(i);
                    break;

                case "e1":
                    pertanyaan.setText("Struktur Tanah Prismatic ?");
                    a1="e2";
                    break;

                case "e2":
                    pertanyaan.setText("Struktur Tanah Lempeng ?");
                    a1="e3";
                    break;

                case "e3":
                    pertanyaan.setText("Jawaban Tidak Ditemukan Ulangi ?");
                    a1="e4";
                    break;

                case "e4":
                    startActivity(i);
                    break;

                case "f1":
                    pertanyaan.setText("Tanah Memiliki Warna Cukup Gelap ?");
                    a1="f2";
                    break;
                case "f2":
                    pertanyaan.setText("Tanah Memiliki Warna Terang ?");
                    a1="f3";
                    break;

                case "f3":
                    pertanyaan.setText("Jawaban Tidak Ditemukan Ulangi ?");
                    a1="f4";
                    break;

                case "f4":
                    startActivity(i);
                    break;
                case "g1":
                    pertanyaan.setText("Tanah Sudah Pernah Dipupuk Organik ?");
                    a1="g2";
                    break;
                case "g2":
                    pertanyaan.setText("Tanah Sudah Pernah Dipupuk Kimia ?");
                    a1="g3";
                    break;

                case "g3":
                    pertanyaan.setText("Jawaban Tidak Ditemukan Ulangi ?");
                    a1="g4";
                    break;

                case "g4":
                    startActivity(i);
                    break;


            }
        });

    }

    private void Regist(){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_REGIST,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String hasil = jsonObject.getString("hasil");
                            String penyakit = jsonObject.getString("penyakit");
                            String penanganan = jsonObject.getString("penanganan");
                            Intent i = new Intent(diagnosa.this,hasil.class);
                            i.putExtra("hasil",hasil);
                            i.putExtra("penyakit",penyakit);
                            i.putExtra("penanganan",penanganan);
                            startActivity(i);


                        } catch (JSONException e) {

                            Toast.makeText(diagnosa.this, "Error Respons! ", Toast.LENGTH_SHORT).show();

                        }
                    }
                },
                error -> Toast.makeText(diagnosa.this, "Error Send ! " + error.toString(), Toast.LENGTH_SHORT).show())
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();

                params.put("daftargejala[]", p7);

                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);


    }

}