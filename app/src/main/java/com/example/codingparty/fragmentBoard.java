package com.example.codingparty;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragmentBoard extends Fragment implements View.OnClickListener {

    private View view;
    private String TAG = "boardFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG,"bf_onCreate");
        view = inflater.inflate(R.layout.activity_board_main,container,false);






//        LinearLayout layoutContest = (LinearLayout) view.findViewById(R.id.ll_contest);
//        layoutContest.setOnClickListener(this::onClick);
//
//        LinearLayout layoutQna = (LinearLayout) view.findViewById(R.id.ll_qna);
//        layoutQna.setOnClickListener(this);
//
//        LinearLayout layoutSuggest = (LinearLayout) view.findViewById(R.id.ll_suggest);
//        layoutSuggest.setOnClickListener(this);
//
//        LinearLayout layoutFree = (LinearLayout) view.findViewById(R.id.ll_free) ;
//        layoutFree.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "in onClick");


//        switch (v.getId()) {
//
//            case R.id.ll_contest:
//                Intent intent_c = new Intent(getActivity().getApplicationContext(), BoardContest.class);
//                startActivity(intent_c);
//                break;
//
//            case R.id.ll_qna:
//                Intent intent_q = new Intent(getActivity().getApplicationContext(), BoardQna.class);
//                startActivity(intent_q);
//                break;
//
//            case R.id.ll_suggest:
//                Intent intent_s = new Intent(getActivity().getApplicationContext(), SuggestMain.class);
//                startActivity(intent_s);
//                break;
//
//            case R.id.ll_free:
//                Intent intent_f = new Intent(getActivity().getApplicationContext(), FreeMain.class);
//                startActivity(intent_f);
//                break;
//        }



        }
}
