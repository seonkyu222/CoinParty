package com.example.codingparty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.codingparty.R;

import java.util.ArrayList;

public class SuggestAdapter extends BaseAdapter {

    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<SuggestItem> itemArrayList = new ArrayList<SuggestItem>();

    // SuggestAdapter의 생성자
    public SuggestAdapter() {

    }

    //Adapter에 사용되는 데이터의 개수를 리턴 : 필수 구현
    @Override
    public int getCount() {
        return itemArrayList.size();
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용된 View를 리턴: 필수 구현현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "board_suggest_item" Layout을 inflate해서 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.board_suggest_item,parent,false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView titleTextView = (TextView) convertView.findViewById(R.id.textView);
        TextView timeTextView = (TextView) convertView.findViewById(R.id.textView2);

        // Data Set(SuggestItem)에서 position에 위치한 데이터 참조 획득
        SuggestItem suggestItem = itemArrayList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        titleTextView.setText(suggestItem.getStrTitle());
        timeTextView.setText(suggestItem.getStrTime());

        return convertView;

    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴: 필수 구현
    @Override
    public long getItemId(int position) {
        return position;
    }

    // 지정한 위치(position)에 있는 데이터 리턴: 필수 구현
    @Override
    public Object getItem(int position) {

        return itemArrayList.get(position);
    }


    // 아이템 데이터 추가를 위한 메서드, 내가 맘대로 지정 ㄱㄴ
    public void addItem(String title, String time) {
        SuggestItem item = new SuggestItem();

        item.getStrTitle();
        item.getStrTime();

        itemArrayList.add(item);
    }


}
