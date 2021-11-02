package com.example.codingparty;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragmentEquipment extends Fragment {

    private View view;
    private String TAG = "equipmentFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "ef_onCreate");
        view = inflater.inflate(R.layout.activity_equipment_main, container, false);

        return view;
    }
}
