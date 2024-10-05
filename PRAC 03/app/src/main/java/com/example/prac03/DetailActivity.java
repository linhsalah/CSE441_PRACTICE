package com.example.prac03;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView countryName, capital, population, area, density, worldShare;
    ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        countryName = findViewById(R.id.nationTextView);
        capital = findViewById(R.id.capitalTextView);
        population = findViewById(R.id.populationTextView);
        area = findViewById(R.id.areaTextView);
        density = findViewById(R.id.densityTextView);
        worldShare = findViewById(R.id.worldShareTextView);
        imageview = findViewById(R.id.flagImageView);



        Intent intent = getIntent();
            countryName.setText(intent.getStringExtra("countryName"));
            capital.setText("Capital: " + intent.getStringExtra("capital"));
            population.setText("Population: " + intent.getLongExtra("population", 0));
            area.setText("Area: " + intent.getStringExtra("area"));
            density.setText("Density: " + intent.getStringExtra("density"));
            worldShare.setText("World Share: " + intent.getStringExtra("worldShare"));
            imageview.setImageResource(intent.getFlags());

    }
}
