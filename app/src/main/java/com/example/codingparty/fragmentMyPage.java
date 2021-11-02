package com.example.codingparty;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragmentMyPage extends Fragment implements View.OnClickListener {

    private View view;
    private String TAG = "myPageFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "mf_onCreate");
        view = inflater.inflate(R.layout.activity_mypage, container, false);

        Button btnScrap = (Button) view.findViewById(R.id.scrap);
        btnScrap.setOnClickListener(this::onClick);



        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.scrap:
                Intent intent_s = new Intent(getActivity().getApplicationContext(),activity_scrap.class);
                startActivity(intent_s);
                break;
        }
    }
}
