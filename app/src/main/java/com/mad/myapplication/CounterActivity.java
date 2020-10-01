package com.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    Button tombolMinus, tombolPlus;
    TextView counterTV;

    int nilai = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        tombolMinus = findViewById(R.id.minusButton);
        tombolPlus = findViewById(R.id.plusButton);
        counterTV = findViewById(R.id.counterTV);

        tombolPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = nilai + 1;
                counterTV.setText(String.valueOf(nilai));
            }
        });

        tombolMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = nilai - 1;
                counterTV.setText(String.valueOf(nilai));
            }
        });
    }
}
