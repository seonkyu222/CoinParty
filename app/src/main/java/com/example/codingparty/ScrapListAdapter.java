package com.example.codingparty;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.codingparty.R;

import java.util.ArrayList;

public class ScrapListAdapter extends BaseAdapter {

    private TextView txt_title;
    private TextView txt_sub;
    private ArrayList<ScrapListItem> listViewItemList = new ArrayList<ScrapListItem>();

    public ScrapListAdapter(){


    }

    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final int pos = position;
        final Context context = parent.getContext();

        // item.xml 레이아웃을 inflate해서 참조획득
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.scrap_item, parent, false);
        }

        // item.xml 의 참조 획득
        TextView txt_title = (TextView)convertView.findViewById(R.id.txt_title);
        TextView txt_sub = (TextView)convertView.findViewById(R.id.txt_sub);

        ScrapListItem listViewItem = listViewItemList.get(position);

        txt_title.setText(listViewItem.getTitle());
        txt_sub.setText(listViewItem.getSub());

        return convertView;
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public Object getItem(int position){
        return listViewItemList.get(position);
    }

    public void addItem(String title, String sub){
        ScrapListItem item = new ScrapListItem();

        item.setTitle(title);
        item.setSub(sub);

        listViewItemList.add(item);
    }
}
