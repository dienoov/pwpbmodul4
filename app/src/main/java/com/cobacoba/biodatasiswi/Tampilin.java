package com.cobacoba.biodatasiswi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tampilin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilin);

        String nama = getIntent().getExtras().getString("nama");
        TextView tampilNama = findViewById(R.id.tampilNama);

        String gender = getIntent().getExtras().getString("gender");
        TextView tampilGender = findViewById(R.id.tampilGender);

        String bobi = getIntent().getExtras().getString("bobi");
        TextView tampilBobi = findViewById(R.id.tampilBobi);

        tampilNama.setText("Nama: " + nama);
        tampilGender.setText("Jenis: " + gender);
        tampilBobi.setText("Bobi: " + bobi);
    }
}