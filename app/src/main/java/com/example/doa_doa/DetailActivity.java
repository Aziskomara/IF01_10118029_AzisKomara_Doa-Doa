package com.example.doa_doa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvNamaDoa,tvArab,tvLatin,tvArti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String doa = getIntent().getExtras().getString("doa");
        String arab = getIntent().getExtras().getString("arab");
        String latin = getIntent().getExtras().getString("latin");
        String arti = getIntent().getExtras().getString("arti");

        tvNamaDoa = findViewById(R.id.tv_title);
        tvArab = findViewById(R.id.tv_arabic);
        tvLatin = findViewById(R.id.tv_latin);
        tvArti = findViewById(R.id.tv_translet);

        tvNamaDoa.setText(doa);
        tvArab.setText(arab);
        tvLatin.setText(latin);
        tvArti.setText(arti);



    }
}