package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

<<<<<<< HEAD:app/src/main/java/com/example/codingparty/LoginActivity.java
public class LoginActivity extends AppCompatActivity {
=======

public class MainActivity extends AppCompatActivity {
>>>>>>> f5bcc6a5d912367db83d4bcf9cb1396458961fd7:app/src/main/java/com/example/codingparty/MainActivity.java
    private EditText user_id;
    private EditText user_pwd;
    private Button login_btn;
    boolean textCheck = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_main);

        user_id = findViewById(R.id.user_id);
        user_pwd = findViewById(R.id.user_pwd);
        login_btn = findViewById(R.id.button_login);

        user_id.addTextChangedListener(loginTextWatcher);
        user_pwd.addTextChangedListener(loginTextWatcher);
    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String idInput = user_id.getText().toString().trim();
            String pwdInput = user_pwd.getText().toString().trim();
            if(!idInput.isEmpty() && !pwdInput.isEmpty()){
                login_btn.setBackground(getResources().getDrawable(R.drawable.round_button_after));
            }else {
                login_btn.setBackground(getResources().getDrawable(R.drawable.round_button));
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    }
