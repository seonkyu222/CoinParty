package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class BoardSuggest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_suggest);

        ListView listView;
        SuggestAdapter adapter;

        Intent intent = getIntent();

        // Adapter 생성
        adapter = new SuggestAdapter();

        //리스트뷰 참조 및 Adapter 달기
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        adapter.addItem("건의합니다", "30분 전");
        adapter.addItem("건의합니다", "1시간 전");
        adapter.addItem("건의합니다", "3시간 전");

        
    }
}