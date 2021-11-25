package com.example.codingparty;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Mypage_Scrap extends AppCompatActivity {

    private ListView listView;
    private ScrapListAdapter adapter;
    private ImageButton click_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mypage_scrap);
        adapter = new ScrapListAdapter();

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");

        adapter.notifyDataSetChanged();

        click_back = (ImageButton) findViewById(R.id.back);
        click_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    }
