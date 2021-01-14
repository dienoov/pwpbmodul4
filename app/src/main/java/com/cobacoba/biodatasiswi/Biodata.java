package com.cobacoba.biodatasiswi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void pindadActivity(View view) {
        Intent intent = new Intent(Biodata.this, Tampilin.class);

        EditText nama = findViewById(R.id.nama);
        intent.putExtra("nama", nama.getText().toString());

        RadioGroup jenisGender = findViewById(R.id.jenisGender);
        RadioButton kepilihGendre = findViewById(jenisGender.getCheckedRadioButtonId());
        intent.putExtra("gender", kepilihGendre.getText().toString());

        CheckBox baca = findViewById(R.id.baca);
        CheckBox olah = findViewById(R.id.olah);
        CheckBox kuli = findViewById(R.id.kuli);
        String lobi = "";

        if (baca.isChecked())
            lobi += baca.getText().toString() + ", ";

        if (olah.isChecked())
            lobi += olah.getText().toString() + ", ";

        if (kuli.isChecked())
            lobi += kuli.getText().toString() + ", ";

        intent.putExtra("bobi", lobi);

        startActivity(intent);
    }
}