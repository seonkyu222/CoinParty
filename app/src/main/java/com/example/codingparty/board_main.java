package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class board_main extends AppCompatActivity {

    private class Menu2Fragment extends Fragment {
    }

    private LinearLayout layout_suggest;
    Button testt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "InBoardMain");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_main);

        layout_suggest = (LinearLayout) findViewById(R.id.ll_suggest);

        layout_suggest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        layout_suggest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "ininininin");
                Intent intent = new Intent(getApplicationContext(), BoardSuggest.class);
                startActivity(intent);

            }
        });
    }
}