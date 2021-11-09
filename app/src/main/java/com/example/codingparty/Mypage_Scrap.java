package com.example.codingparty;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Mypage_Scrap extends AppCompatActivity {

    private ListView listView;
    private ScrapListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mypage_scrap);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 왼쪽 상단 버튼 만들기
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_icon_before_28px); //왼쪽 상단 버튼 아이콘 지정

        adapter = new ScrapListAdapter();

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");
        adapter.addItem("어제 내 세상이 무너졌어","임진우ㆍ1시간 전");

        adapter.notifyDataSetChanged();
        ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:{

                Intent intent = new Intent(getApplicationContext(),activity_mypage.class);
                startActivity(intent);
                return true;
            }
        }


        return super.onOptionsItemSelected(item);
    }
}
