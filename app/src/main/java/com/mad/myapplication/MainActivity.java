package com.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tombolMulai = findViewById(R.id.mulaiButton);
        tombolMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindahHalaman();
            }
        });

    }

    private void tampilkanToast(){
        Toast.makeText(this, "Tombol ini di klik", Toast.LENGTH_SHORT).show();
    }

    private void pindahHalaman(){

        //Buat intent untuk pindah halaman di sini
        Intent intent = new Intent(this, CounterActivity.class);
        startActivity(intent);

    }
}
