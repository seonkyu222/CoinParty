package com.example.codingparty;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

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
    Toolbar toolbar;
    private ListView list1;
    private ListView list2;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @SuppressLint({"NewApi", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "fdhgdgsgj");

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 왼쪽 상단 버튼 만들기
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_icon_sidebar_28px); //왼쪽 상단 버튼 아이콘 지정

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView = (NavigationView)findViewById(R.id.navigation_view);


        BottomNavigationView navView = findViewById(R.id.bottom_navigation);

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



        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ // 왼쪽 상단 버튼 눌렀을 때
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() { //뒤로가기 했을 때
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

};
