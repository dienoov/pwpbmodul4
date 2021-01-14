package com.cobacoba.biodatasiswi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void pindadActivity(View view){
        Intent intent = new Intent(Biodata.this, Tampilin.class);
        startActivity(intent);
    }
}