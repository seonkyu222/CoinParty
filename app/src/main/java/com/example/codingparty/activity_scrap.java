package com.example.codingparty;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class activity_scrap extends AppCompatActivity {

    private ListView listView;
    private ScrapListAdapter adapter;
    ImageButton before;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrap);

        before = (ImageButton) findViewById(R.id.iv_before);

        adapter = new ScrapListAdapter();

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");

        adapter.notifyDataSetChanged();

        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_mypage.class);
            }
        });
    }

}
