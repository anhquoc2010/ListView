package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Item> itemList;

    public ItemAdapter(Context context, int layout, List<Item> itemList) {
        this.context = context;
        this.layout = layout;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);

        TextView tvTen = convertView.findViewById(R.id.textView_title);
        TextView tvNam = convertView.findViewById(R.id.textView_price);
        TextView tvGio = convertView.findViewById(R.id.textView_description);
        ImageView ivHinh = convertView.findViewById(R.id.imageView);

        Item item = itemList.get(position);

        tvTen.setText(item.getName());
        tvNam.setText(item.getDetail());
        tvGio.setText(item.getDescription());
        ivHinh.setImageResource(item.getImageResourceID());

        return convertView;
    }
}
