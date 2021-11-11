package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class FreeMain extends AppCompatActivity {

    private ListView mlistView;
    private String Tag = "freeListt";

    private ImageButton text_save;
    private ImageButton click_back;

    private ArrayList <String> name = new ArrayList<>(5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_free);

        mlistView = (ListView) findViewById(R.id.free_list);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.i("item", "itemClick");
                Intent intent = new Intent(getApplicationContext(), PostItem.class);
                startActivity(intent);

            }
        });

        text_save = (ImageButton) findViewById(R.id.pius);
        text_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AddText.class);
                startActivity(intent);
            }
        });

        dataset();

        click_back = (ImageButton) findViewById(R.id.back);
        click_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Log.i(Tag, "자유게시판 메인 onCreate");

    }

    public void dataset() {
        FreeAdapter freeAdapter = new FreeAdapter();

        name.add("체선규");
        name.add("김한서");
        name.add("서설");
        name.add("김민영");
        name.add("설호성");

        freeAdapter.addItem("어제 내 세상이 무너졌어",  "홍성호", "2분 전", "3", "500");
        int time = 0;
        for(int i = 0; i < 10; i++){
            freeAdapter.addItem("왜 이러지의 연속",  "웅냥나나", i + "시간 전", i + "", (i+2) + "");
            freeAdapter.addItem("이름을 바꾸고 싶지 뭐야",  "웅냥나나", i + "시간 전", i + "", (i+2) + "");
        }
        freeAdapter.addItem("내가 만약 너무 긴 글을 써버리면 어쩌지?",  "서설", "11" + "시간 전", "100" + "", "50");
        freeAdapter.addItem("긴 글을 쓰지 말자,,",  "서설", "11" + "시간 전", "70" + "", "5");
        freeAdapter.addItem("나는 아직 그거까진 좀 힘들어,,",  "서설", "11" + "시간 전", "10" + "", "0");


        mlistView.setAdapter(freeAdapter);
        Log.i(Tag, "자유게시판 메인 dataSetting");

    }
}