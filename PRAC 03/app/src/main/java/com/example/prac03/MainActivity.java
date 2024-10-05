package com.example.prac03;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter countryAdapter;
    List<Country> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        countryList = new ArrayList<>();
        countryList.add(new Country("India", "New Delhi", 1428000000L, "2,973,190 Km²", "481 people/Km²", "17.76%", R.mipmap.indi));
        countryList.add(new Country("China", "Beijing", 1411778724L, "9,596,961 Km²", "153 people/Km²", "17.56%", R.mipmap.china));
        countryList.add(new Country("United States", "Washington D.C.", 331883986L, "9,826,675 Km²", "36 people/Km²", "4.23%", R.mipmap.my));
        countryList.add(new Country("Indonesia", "Jakarta", 273523621L, "1,904,569 Km²", "144 people/Km²", "3.51%", R.mipmap.indi));
        countryList.add(new Country("Pakistan", "Islamabad", 225199937L, "881,913 Km²", "255 people/Km²", "2.83%", R.mipmap.pa));
        countryList.add(new Country("Brazil", "Brasília", 213993437L, "8,515,767 Km²", "25 people/Km²", "2.73%", R.mipmap.bra));
        countryAdapter = new Adapter(countryList, this);
        recyclerView.setAdapter(countryAdapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}