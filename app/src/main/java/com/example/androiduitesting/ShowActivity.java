package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "city_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView textViewCityName = findViewById(R.id.text_city_name);
        Button buttonBack = findViewById(R.id.button_back);

        Intent intent = getIntent();
        String cityName = intent.getStringExtra(EXTRA_CITY_NAME);

        if (cityName != null) {
            textViewCityName.setText(cityName);
        }

        buttonBack.setOnClickListener(v -> finish());
    }
}
