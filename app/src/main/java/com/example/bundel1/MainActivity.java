package com.example.bundel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNama, edtAlamat,edtPekerjaan,edtNoHP,edtLamakerja,edtKompetensi,edtAsalSekolah;
    String Namanya, Alamatnya,Pekerjaannya,NoHP,Lamakerjanya,Kompetensinya,AsalSekolahnya;
    Button btnInput;
    Pegawai pegawai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText) findViewById(R.id.edt_Nama);
        edtAlamat = (EditText) findViewById(R.id.edt_Alamat);
        edtPekerjaan = (EditText) findViewById(R.id.edt_Pekerjaan);
        edtLamakerja = (EditText) findViewById(R.id.edt_LamaKerja);
        edtKompetensi = (EditText) findViewById(R.id.edt_Kompetensi);
        edtNoHP = (EditText) findViewById(R.id.edt_NoHp);
        edtAsalSekolah = (EditText) findViewById(R.id.edt_AsalSekolah);

        btnInput = (Button) findViewById(R.id.btn_Input);
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Namanya=edtNama.getText().toString();
                Alamatnya=edtAlamat.getText().toString();
                Pekerjaannya=edtPekerjaan.getText().toString();
                NoHP=edtNoHP.getText().toString();
                Lamakerjanya=edtLamakerja.getText().toString();
                Kompetensinya=edtLamakerja.getText().toString();
                AsalSekolahnya=edtAsalSekolah.getText().toString();

                pegawai=new Pegawai(Namanya,Alamatnya,NoHP,Pekerjaannya,Lamakerjanya,AsalSekolahnya,Kompetensinya);

                Intent kirim=new Intent(MainActivity.this,DetailActivity.class);
                kirim.putExtra("xyz",pegawai);
                startActivity(kirim);
            }
        });
    }
}
