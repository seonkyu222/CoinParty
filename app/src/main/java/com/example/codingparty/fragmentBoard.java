package com.example.codingparty;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class fragmentBoard extends Fragment implements View.OnClickListener {

    private View view;
    private String TAG = "boardFragment";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG,"bf_onCreate");
        View view = inflater.inflate(R.layout.activity_board_main, container, false);

        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.ll_study);
        constraintLayout.setOnClickListener(this);

        LinearLayout layoutContest = (LinearLayout) view.findViewById(R.id.ll_contest);
        layoutContest.setOnClickListener(this::onClick);

        LinearLayout layoutQna = (LinearLayout) view.findViewById(R.id.ll_qna);
        layoutQna.setOnClickListener(this);

        LinearLayout layoutSuggest = (LinearLayout) view.findViewById(R.id.ll_suggest);
        layoutSuggest.setOnClickListener(this);

        LinearLayout layoutFree = (LinearLayout) view.findViewById(R.id.ll_free) ;
        layoutFree.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "in onClick");


        switch (v.getId()) {

            case R.id.ll_study:
                Log.i(TAG, "in study");
// 잉 아 몰라,,, 몰라몰라,,, (._.),,,
//                final PopupMenu popupMenu = new PopupMenu(getActivity().getApplicationContext(), view);
//                popupMenu.getMenuInflater().inflate(R.menu.popup,popupMenu.getMenu());
//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
//
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item) {
//
//                        switch (v.getId()){
//                            case R.id.pop_menu1:
//                                Log.i(TAG, "팝업 메뉴 1 클릭");
//
//                            case R.id.pop_menu2:
//
//                            case R.id.pop_menu3:
//
//                            case R.id.pop_menu4:
//                        }
//
//                        return true;
//                    }
//                });
//                popupMenu.show();
                break;

            case R.id.ll_contest:
                Intent intent_c = new Intent(getActivity().getApplicationContext(), BoardContest.class);
                startActivity(intent_c);
                break;

            case R.id.ll_qna:
                Intent intent_q = new Intent(getActivity().getApplicationContext(), BoardQna.class);
                startActivity(intent_q);
                break;

            case R.id.ll_suggest:
                Intent intent_s = new Intent(getActivity().getApplicationContext(), SuggestMain.class);
                startActivity(intent_s);
                break;

            case R.id.ll_free:
                Intent intent_f = new Intent(getActivity().getApplicationContext(), FreeMain.class);
                startActivity(intent_f);
                break;
        }

    }

}
