package com.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    //Global Variable, variable ini bisa diakses di seluruh fungsi yang terdapat di dalam kelas (CounterActivity) ini
    Button tombolMinus, tombolPlus;
    TextView counterTV;

    int nilai = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        //Variabel lokal, hanya bisa diakses di dalam fungsi ini (onCreate)
        String nama = "John";

        tombolMinus = findViewById(R.id.minusButton);
        tombolPlus = findViewById(R.id.plusButton);
        counterTV = findViewById(R.id.counterTV);

        tombolPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = nilai + 1;
                setNilaiCounter();
            }
        });

        tombolMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = nilai - 1;
                setNilaiCounter();
            }
        });
    }

    // Perhatikan bagaimana counterTV bisa diakses di fungsi ini.
    // Cobalah memanggil variabel 'nama' yang ada di fungsi onCreate ke dalam fungsi ini, apakah variabel tersebut bisa diakses ?
    private void setNilaiCounter(){
        counterTV.setText(String.valueOf(nilai));
    }
}
