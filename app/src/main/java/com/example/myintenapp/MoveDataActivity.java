package com.example.myintenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveDataActivity extends AppCompatActivity {
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";

    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_data);

        tvData = findViewById(R.id.tv_data);

        String nama = getIntent().getStringExtra(EXTRA_NAME);
        int umur = getIntent().getIntExtra(EXTRA_AGE, 0);

        String text = "Name : " +nama+",\nUmur : "+umur;
        tvData.setText(text);
    }
}
