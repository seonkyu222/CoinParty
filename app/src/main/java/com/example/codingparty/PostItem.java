package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PostItem extends AppCompatActivity {

    private ImageButton click_back;
    private ImageView click_file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_item);

        click_back = (ImageButton) findViewById(R.id.back);
        click_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });

        click_file = (ImageView) findViewById(R.id.image_file);
        click_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("adf", "image click");

                Intent intent = new Intent(getApplicationContext(), PostFileClick.class);
                startActivity(intent);
                finish();

            }
        });




    }
}