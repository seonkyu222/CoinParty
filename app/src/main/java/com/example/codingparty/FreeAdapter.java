package com.example.codingparty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FreeAdapter extends BaseAdapter {

    private ArrayList<FreeItem> Items = new ArrayList<FreeItem>();

    @Override
    public int getCount() { return Items.size(); }

    @Override
    public FreeItem getItem(int position) { return Items.get(position); }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.suggest_listview_custom, parent, false);
        }

        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView user = (TextView) convertView.findViewById(R.id.user);
        TextView time = (TextView) convertView.findViewById(R.id.time);
        TextView b_count = (TextView) convertView.findViewById(R.id.b_count);
        TextView c_count = (TextView) convertView.findViewById(R.id.c_count);

        FreeItem item = getItem(position); // 아니 나 너 왜 안되는지 이해가 안 가 알 수가 없네?

        title.setText(item.getF_title());
        user.setText(item.getF_user());
        time.setText(item.getF_time());
        b_count.setText(item.getF_bCount());
        c_count.setText(item.getF_cCount());

        return convertView;
    }


    public void addItem(String title, String user, String time, String b_count, String c_count) {

        FreeItem freeItem = new FreeItem();

        freeItem.setF_title(title);
        freeItem.setF_user(user);
        freeItem.setF_time(time);
        freeItem.setF_bCount(b_count);
        freeItem.setF_cCount(c_count);

        Items.add(freeItem);
    }
}
