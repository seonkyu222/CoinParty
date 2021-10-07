package com.example.codingparty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;


public class MainActivity extends AppCompatActivity {
    Fragment menu1Fragment;
    Fragment menu2Fragment;
    Fragment menu3Fragment;
    Fragment menu4Fragment;


    private class Menu1Fragment extends Fragment {
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.bottom_home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main,menu1Fragment).commit();
                    return true;

                case R.id.bottom_equipment:
                    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main,menu2Fragment).commit();
                    return true;

                case R.id.bottom_list:
                    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main,menu3Fragment).commit();
                    return true;

                case R.id.bottom_myPage:
                    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main,menu4Fragment).commit();
                    return true;

            }
            return false;
        }
    };



    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        menu1Fragment = new mainFragment(); //메인
        menu2Fragment = new equipmentFragment(); //비품관리
        menu3Fragment = new boardFragment(); //보드
        menu4Fragment = new myPageFragment(); //마이페이지



        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main,menu1Fragment).commit();

    }

    private void setSupportActionBar(Toolbar myToolbar) {
    }
}