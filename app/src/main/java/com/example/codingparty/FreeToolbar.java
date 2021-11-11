package com.example.codingparty;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class FreeToolbar extends AppCompatActivity {

    ImageButton test_pius;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar_free);

        Log.i("freeTool", "tool onCreate");

        test_pius = (ImageButton) findViewById(R.id.pius);

        test_pius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AddText.class);
                startActivity(intent);
            }
        });



    }

}