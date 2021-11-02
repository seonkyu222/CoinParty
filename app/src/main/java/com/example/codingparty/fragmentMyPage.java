package com.example.codingparty;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragmentMyPage extends Fragment {

    private View view;
    private String TAG = "myPageFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "mf_onCreate");
        view = inflater.inflate(R.layout.activity_mypage, container, false);

        return view;
    }
}
