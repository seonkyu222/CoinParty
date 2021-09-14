package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class activity_main_maybe extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_maybe);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<ExpandableListAdapter.Item> data = new ArrayList<>();
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "STUDY"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "과제"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "학습노트"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "학습계획표"));

        recyclerView.setAdapter(new ExpandableListAdapter(data));



    }
}