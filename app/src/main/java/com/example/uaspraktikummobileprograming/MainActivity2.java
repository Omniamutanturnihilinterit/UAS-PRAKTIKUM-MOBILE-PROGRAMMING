package com.example.uaspraktikummobileprograming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvnama, tvnpm, tvsubjek ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvnama = findViewById(R.id.tv_nama);
        tvnpm = findViewById(R.id.tv_npm);
        tvsubjek = findViewById(R.id.tv_subjek);

        Intent terima = getIntent();
        String terimaNama = terima.getStringExtra("amplopNama");
        String terimaNpm = terima.getStringExtra("amplopNpm");
        String terimaSubjek = terima.getStringExtra("amplopSubjek");

        tvnama.setText(terimaNama);
        tvnpm.setText(terimaNpm);
        tvsubjek.setText(terimaSubjek);

    }
}