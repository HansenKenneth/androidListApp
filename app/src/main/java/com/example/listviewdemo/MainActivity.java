package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] countries = {"USA", "Danmark"/*, "Norge", "Italien", "Belgien", "England", "Rusland", "Japan"*/};
        ListView listView = findViewById(R.id.myListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.myrow, R.id.myTextView, countries);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((_listView, linearLayout, adapterPos, arrPos) -> {
        });

    }
}