package com.example.codingparty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SuggestAdapter extends BaseAdapter {

    private ArrayList<SuggestItem> Items = new ArrayList<SuggestItem>();

    @Override
    public int getCount() {
        return Items.size();
    }

    @Override
    public SuggestItem getItem(int position) {
        return Items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.suggest_listview_custom, parent, false);
        }

        TextView tv_title = (TextView) convertView.findViewById(R.id.tv_title);
        TextView tv_time = (TextView) convertView.findViewById(R.id.tv_time);

        SuggestItem item = getItem(position);

        tv_title.setText(item.getTitle());
        tv_time.setText(item.getTime());

        return convertView;
    }

    public void addItem(String title, String time){
        SuggestItem suggestItem = new SuggestItem();

        suggestItem.setTitle(title);
        suggestItem.setTime(time);

        Items.add(suggestItem);

    }
}
