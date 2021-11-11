package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class AddText extends AppCompatActivity {

    private String TAG = "addText";
    private ImageButton click_drop;
    private ImageButton click_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_text);

        click_drop = (ImageButton) findViewById(R.id.add_drop);
        click_drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "drop click");
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

}