package com.example.codingparty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import javax.security.auth.login.LoginException;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);

        Handler hd = new Handler();
        hd.postDelayed(new SplashHandler(),3000);
    }

    private class SplashHandler implements Runnable {
        public void run(){
            startActivity(new Intent(getApplication(),MainActivity.class));
            SplashActivity.this.finish();
        }
    }


}
