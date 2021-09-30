//package com.example.codingparty;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import org.jetbrains.annotations.NotNull;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public abstract class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//
//    private Context mCtx;
//    private List<Item> items = null;
//    private ArrayList<Item> arrayList;
//
//    public ItemAdapter (Context context, List<Item> items) {
//        this.mCtx = context;
//        this.items = items;
//        arrayList = new ArrayList<Item>();
//        arrayList.addAll(items);
//    }
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
//
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.board_free_list,null);
//
//        return new ViewHolderder(v); //너 머야 왜구래 우리 친하게 지내!!
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull @NotNull ItemAdapter.ViewHolderder holder, int position) {
//
//        final Item item = items.get(position);
//        holder.tv_title.setText(item.getTitle());
//    }
//
//    @Override
//    public int getItemCount() {
//        return this.items.size();
//    }
//
//    private class ViewHolderder extends RecyclerView.ViewHolder {
//        TextView tv_title;
//
//        public ViewHolderder(@NonNull @NotNull View itemView) {
//            super(itemView);
//
//            tv_title = (TextView) itemView.findViewById(R.id.free_title);
//        }
//    }
//
//
//}
