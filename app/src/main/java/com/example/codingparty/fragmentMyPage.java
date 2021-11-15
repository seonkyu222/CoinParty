package com.example.codingparty;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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

        TextView txtOption = (TextView) view.findViewById(R.id.option);
        txtOption.setOnClickListener(this::onClick);

        TextView txtHistory = (TextView) view.findViewById(R.id.history);
        txtHistory.setOnClickListener(this::onClick);

        TextView txtRecord = (TextView) view.findViewById(R.id.record);
        txtRecord.setOnClickListener(this::onClick);


        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.scrap:
                Intent intent_s = new Intent(getActivity().getApplicationContext(), Mypage_Scrap.class);
                startActivity(intent_s);
                break;

            case R.id.option:
                Intent intent_o = new Intent(getActivity().getApplicationContext(), Mypage_Option.class);
                startActivity(intent_o);
                break;

            case R.id.history:
                Intent intent_h = new Intent(getActivity().getApplicationContext(), Mypage_History.class);
                startActivity(intent_h);
                break;

            case R.id.record:
                Intent intent_r = new Intent(getActivity().getApplicationContext(), Mypage_Record.class);
                startActivity(intent_r);
                break;
        }
    }
}
