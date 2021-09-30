package com.example.codingparty;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FreeAdapter extends RecyclerView.Adapter<FreeAdapter.ViewHolder> {

    ArrayList<Free> items = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.board_free_item, parent, false);
        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull FreeAdapter.ViewHolder holder, int position) {
        Free item = items.get(position);

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name;
        TextView tv_userName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.free_title);
            tv_userName = itemView.findViewById(R.id.free_user_time);

        }

        public void setItem(Free item){
            tv_name.setText(item.getStrTitle());
            tv_userName.setText(item.getStrUserName());

        }


    }
}
