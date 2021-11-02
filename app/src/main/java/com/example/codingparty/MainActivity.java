package com.example.codingparty;

import android.annotation.SuppressLint;
import android.os.Bundle;
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
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Fragment menu1Fragment;
    Fragment menu2Fragment;
    Fragment menu3Fragment;
    Fragment menu4Fragment;

    EditText user_pwd;
    Button button_login;
    Toolbar toolbar;
    private ListView list1;
    private ListView list2;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

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


    @SuppressLint({"NewApi", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 왼쪽 상단 버튼 만들기
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_icon_sidebar_28px); //왼쪽 상단 버튼 아이콘 지정

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView = (NavigationView)findViewById(R.id.navigation_view);

        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        menu1Fragment = new mainFragment(); //메인
        menu2Fragment = new equipmentFragment(); //비품관리
        menu3Fragment = new boardFragment(); //보드
        menu4Fragment = new myPageFragment(); //마이페이지

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

        menu1Fragment = new mainFragment();
        menu2Fragment = new equipmentFragment();
        menu3Fragment = new boardFragment();
        menu4Fragment = new myPageFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main,menu1Fragment).commit();


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

