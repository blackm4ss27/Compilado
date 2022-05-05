package com.example.compilado;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AcSonidos extends AppCompatActivity {

    //declaracion de variables
    ImageButton btnPiano, btnBass, btnGuitar, btnDrums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_sonidos);

        btnPiano = findViewById(R.id.imbPiano);
        btnBass = findViewById(R.id.imbBass);
        btnGuitar = findViewById(R.id.imbGuitar);
        btnDrums = findViewById(R.id.imbDrums);

        btnPiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(AcSonidos.this, R.raw.piano);
                mp.start();
            }
        });

        btnBass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(AcSonidos.this, R.raw.bajo);
                mp.start();
            }
        });

        btnGuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(AcSonidos.this, R.raw.guitarra);
                mp.start();
            }
        });

        btnDrums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(AcSonidos.this, R.raw.bateria);
                mp.start();
            }
        });
    }
}