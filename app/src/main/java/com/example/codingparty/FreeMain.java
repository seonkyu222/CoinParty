package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class FreeMain extends AppCompatActivity {

    private ListView mlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_free);

        mlistView = (ListView) findViewById(R.id.free_list);




    }
}