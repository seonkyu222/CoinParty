package com.example.codingparty;


import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragmentBoard extends Fragment implements View.OnClickListener {

    private View view;
    private String TAG = "boardFragment";
    private LinearLayout ll_suggest;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG,"bf_onCreate");
        view = inflater.inflate(R.layout.activity_board_main,container,false);

        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_suggest);
        linearLayout.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "board 클릭 in");
        Intent intent = new Intent(getActivity().getApplicationContext(), board_list.class);
        startActivity(intent);

        }
}
