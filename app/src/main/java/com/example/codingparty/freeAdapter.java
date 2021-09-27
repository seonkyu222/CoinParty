package com.example.codingparty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class freeAdapter extends RecyclerView.Adapter<Holder> {

    ArrayList<String> title;
    ArrayList<String> username;

    freeAdapter(ArrayList<String> title){
        this.title = title;
    }

    @NonNull
    @NotNull
    @Override
    public Holder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.board_free_list, parent, false);

        return new Holder(view);


    } //viewHolder를 생성(레이아웃 생성)


    @Override
    public void onBindViewHolder(@NonNull @NotNull Holder holder, int position) {

        holder.tv.setText(title.get(position));

    } //viewHolder가 재활용될 때 실행되는 메서드


    @Override
    public int getItemCount() {
        return title.size();

    } // item개수를 조회
}


class Holder extends RecyclerView.ViewHolder {

    TextView tv;

    public Holder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.free_title);
    }

}
