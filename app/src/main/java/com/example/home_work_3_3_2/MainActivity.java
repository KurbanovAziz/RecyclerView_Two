package com.example.home_work_3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList cityList = new ArrayList();
    private RecyclerView rvCity;
    private RecyclerView.Adapter cityAdapter = new CityAdapter(cityList);


    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCity = findViewById(R.id.rv_city);
        loadData();
        rvCity.setAdapter(cityAdapter);
    }

    private void loadData() {
        cityList.add("Bishkek");
        cityList.add("Ош");
        cityList.add("Каракол");
        cityList.add("Токмак");
        cityList.add("Москва");
        cityList.add("Питер");
        cityList.add("Лондон");
        cityList.add("Париж");
        cityList.add("Кипр");
        cityList.add("Астана");
        cityList.add("Алматы");
        cityList.add("Нью-Йорк");
        cityList.add("Лос-Анджелес");
        cityList.add("Мексика");
    }
}