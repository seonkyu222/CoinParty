package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SuggestMain extends AppCompatActivity {

    private ListView mListView;
    private ImageButton click_back;
    private ImageButton click_plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_suggest);

        mListView = (ListView) findViewById(R.id.listView);

        dataSetting();

        click_plus = (ImageButton) findViewById(R.id.pius);
        click_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AddText.class);
                startActivity(intent);
            }
        });

        click_back = (ImageButton) findViewById(R.id.back);
        click_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }

    private void dataSetting(){

        SuggestAdapter mMyAdapter = new SuggestAdapter();

        int time = 0;
        for (int i=0; i<20; i++) {
            time += 1;
            mMyAdapter.addItem("건의할게욥!!",time + "시간 전" );
            mMyAdapter.addItem("건의할거야!!",time + "시간 전" );
            mMyAdapter.addItem("우에 엥 이거 고쳐죠ㅠㅜ",time + "시간 전" );
        }

        /* 리스트뷰에 어댑터 등록 */
        mListView.setAdapter(mMyAdapter);
    }





}