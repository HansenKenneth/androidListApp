package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        setContentView(R.layout.activity_main);
        String[] countries = {"USA", "Danmark"/*, "Norge", "Italien", "Belgien", "England", "Rusland", "Japan"*/};
        int [] billeder = {R.drawable.dannebrog, R.drawable.usa};
        MyAdapter myAdapter = new MyAdapter(this, countries, billeder);
        ListView listView = findViewById(R.id.myListView2);
        listView.setAdapter(myAdapter);
    }
}