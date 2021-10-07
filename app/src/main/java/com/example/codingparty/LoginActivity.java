package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {
    private EditText user_id;
    private EditText user_pwd;
    private Button login_btn;
    boolean textCheck = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user_id = findViewById(R.id.user_id);
        user_pwd = findViewById(R.id.user_pwd);
        login_btn = findViewById(R.id.button_login);

        user_id.addTextChangedListener(loginTextWatcher);
        user_pwd.addTextChangedListener(loginTextWatcher);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
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
