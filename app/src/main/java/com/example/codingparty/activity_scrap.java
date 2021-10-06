package com.example.codingparty;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class activity_scrap extends AppCompatActivity {

    ListView list;

    @SuppressLint({"NewApi", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrap);
        list=(ListView) findViewById((R.id.list));
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("김석환");
        data.add("임진우");
        data.add("한지수");
        data.add("박정혁");
        data.add("금도현");
        data.add("최이슬");
        adapter.notifyDataSetChanged();

    }
}
