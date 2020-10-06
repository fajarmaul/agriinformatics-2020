package com.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//Sebuah kelas, atau sederhananya untuk saat ini adalah tempat kita meletakkan kode dari program yang mau kita jalankan
public class MainActivity extends AppCompatActivity {

    //Baris ini adalah baris komentar, tidak akan diperhatikan oleh kode ketika di 'compile'
    //Biasanya diawali dengan dua buah garis miring


    //Awal mula program di android di jalankan
    //Untuk saat ini, anggap fungsi ini irip seperti fungsi "main" ketika kalian mencoba pemrograman C atau python
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ini adalah 'binding', mengikat komponen UI yang ada di XML, dengan variabel yang ada di file java ini
        Button tombolMulai = findViewById(R.id.mulaiButton);

        //Memasang "Pendengar Klik" pada tombolmulai. 'Pendengar' atau listener ini maksudnya, ketika tombol di klik, dia mau menjalankan apa
        //Harus diperhatikan, tombol harus sudah di binding terlebih dahulu, atau nanti akan muncul 'NullPointerException'
        tombolMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Uncomment line 34 dengan menekan CTRL dan ? di saat yang bersamaan untuk membuat program menjalankan perintah di line 34
                //tampilkanToast();

                pindahHalaman();
            }
        });

    }

    //Sebuah fungsi yang tujuannya adalah menampilkan 'Toast'
    private void tampilkanToast(){
        Toast.makeText(this, "Tombol ini di klik", Toast.LENGTH_SHORT).show();
    }

    //Fungsi untuk pindah halaman
    private void pindahHalaman(){

        //Buat intent untuk pindah halaman di sini
        Intent intent = new Intent(this, CounterActivity.class);
        startActivity(intent);

    }
}
