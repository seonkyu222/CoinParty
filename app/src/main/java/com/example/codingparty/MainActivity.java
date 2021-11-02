package com.example.codingparty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {


    // 바텀 네비게이션
    BottomNavigationView bottomNavigationView;
    private String TAG = "mainClass";

    //프래그먼트 변수
    fragmentHome fragment_home;
    fragmentEquipment fragment_equipment;
    fragmentBoard fragment_board;
    fragmentMyPage fragment_myPage;

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

        //프래그먼트 생성
        fragment_home = new fragmentHome();
        fragment_equipment = new fragmentEquipment();
        fragment_board = new fragmentBoard();
        fragment_myPage = new fragmentMyPage();

        // 바텀 네비게이션 id 찾기
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Log.i(TAG, "바텀 네비게이션 클릭");

                switch (item.getItemId()){

                    case R.id.bottom_home:
                        Log.i(TAG, "in home");
                        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment_home).commitAllowingStateLoss();
                        return true;

                    case R.id.bottom_equipment:
                        Log.i(TAG, "in equipment");
                        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment_equipment).commitAllowingStateLoss();
                        return true;

                    case R.id.bottom_list:
                        Log.i(TAG, "in board");
                        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment_board).commitAllowingStateLoss();
                        return true;

                    case R.id.bottom_myPage:
                        Log.i(TAG, "in myPage");
                        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment_myPage).commitAllowingStateLoss();
                        return true;
                }


                return true;
            }
        });


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


};

