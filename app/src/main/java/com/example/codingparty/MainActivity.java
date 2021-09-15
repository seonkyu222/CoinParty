package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
     EditText user_pwd;
    Button button_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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
}