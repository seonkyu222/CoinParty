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

        private LinearLayout ll_suggest;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_board_main);

            Log.i("여기?", "여기까지 왔어?");

            ll_suggest = (LinearLayout) findViewById(R.id.ll_suggest);
            ll_suggest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("여기는", "건의사항을 클릭했어");
                }
            });


        }

    }


}