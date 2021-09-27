package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    EditText user_pwd;
    Button button_login;
    Toolbar myToolbar;
    private ListView list1;


    @SuppressLint({"NewApi", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(myToolbar);

        list1 = (ListView)findViewById(R.id.list1);
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list1.setAdapter(adapter);

        data.add("asdf");
        data.add("안녕하세여");
        data.add("안녕하세여");
        data.add("안녕하세여");
        adapter.notifyDataSetChanged();







/*        user_pwd =  findViewById(R.id.user_pwd);
        button_login=findViewById(R.id.button_login);
        user_pwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0) {
                    button_login.setClickable(true);
//                    button_login.setBackgroundColor(Color.BLUE);
                } else {
                    button_login.setClickable(false);
                    button_login.setBackgroundColor(Color.GRAY);
                }
            }
        }); */

    }

    private void setSupportActionBar(Toolbar myToolbar) {
    }

}