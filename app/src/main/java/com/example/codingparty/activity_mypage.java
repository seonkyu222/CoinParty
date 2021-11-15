package com.example.codingparty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity_mypage extends AppCompatActivity {

    Button test;
    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        test = (Button) findViewById(R.id.scrap);
        text1 = (TextView) findViewById(R.id.option);
        text2 = (TextView) findViewById(R.id.history);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mypage_Option.class);
                startActivity(intent);
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mypage_History.class);
                startActivity(intent);
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mypage_Scrap.class);
                startActivity(intent);
            }
        });

    }

//    public void onClick(View view){
//        Intent intent = new Intent(this, Mypage_Scrap.class);
//        startActivity(intent);
//    }
}
