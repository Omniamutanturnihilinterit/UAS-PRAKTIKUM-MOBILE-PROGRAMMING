package com.example.uaspraktikummobileprograming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.uaspraktikummobileprograming.MainActivity2;
import com.example.uaspraktikummobileprograming.R;


public class MainActivity extends AppCompatActivity {


    private EditText npmmhs, namamhs, subjekmhs;
    Button btnTampil ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        npmmhs = findViewById(R.id.npm_mhs);
        namamhs = findViewById(R.id.nama_mhs);
        subjekmhs = findViewById(R.id.subjek_mhs);
        btnTampil = findViewById(R.id.btn_tampil);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String npm = npmmhs.getText().toString();
                String nama = namamhs.getText().toString();
                String subjek = subjekmhs.getText().toString();

                if(npm.trim().equals("")){
                    npmmhs.setError("NPM Tidak Boleh Kosong");
                }
                else if(nama.trim().equals("")){
                    namamhs.setError("Nama Tidak Boleh Kosong");
                }
                else if(subjek.trim().equals("")) {
                    subjekmhs.setError("Subjek Text Tidak Boleh Kosong");
                }
                else {
                    Intent kirim = new Intent(MainActivity.this, MainActivity2.class);
                    kirim.putExtra("amplopNpm", npm) ;
                    kirim.putExtra("amplopNama", nama) ;
                    kirim.putExtra("amplopSubjek", subjek);
                    startActivity(kirim);
                }
            }
        });
    }
}