package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class activity_board_free extends AppCompatActivity {

    ArrayList<String> title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_free);

        title = new ArrayList<>();
        title.add("우에엥 1");
        title.add("뿌에엥 2");
        title.add("무에엥 3");
        title.add("끼에엥 4");

        freeAdapter adapter = new freeAdapter(title);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}