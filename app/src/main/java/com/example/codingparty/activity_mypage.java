package com.example.codingparty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity_mypage extends AppCompatActivity {

    Button test;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        test = (Button) findViewById(R.id.scrap);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mypage_Scrap.class);
                startActivity(intent);
            }
        });

    }

    public void onClick(View view){
        Intent intent = new Intent(this, Mypage_Scrap.class);
        startActivity(intent);
    }
}
