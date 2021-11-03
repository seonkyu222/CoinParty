package com.example.codingparty;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class activity_scrap extends AppCompatActivity {

    private ListView listView;
    private ScrapListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrap);

        adapter = new ScrapListAdapter();

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");

        adapter.notifyDataSetChanged();
    }
}
