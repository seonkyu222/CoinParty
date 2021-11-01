package com.example.codingparty;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    EditText user_pwd;
    Button button_login;
    Toolbar myToolbar;
    private ListView list1;
    private ListView list2;

    @SuppressLint({"NewApi", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list1 = (ListView) findViewById(R.id.list1);
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list1.setAdapter(adapter);

        data.add("김석환");
        data.add("임진우");
        data.add("한지수");
        data.add("박정혁");
        data.add("금도현");
        data.add("최이슬");
        adapter.notifyDataSetChanged();


    }




}



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



