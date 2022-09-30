package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ItemDetailActivity extends AppCompatActivity {

    ListView lvItem;
    ArrayList<Item> arrayListItem;
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        findViews();

        itemAdapter = new ItemAdapter(this, R.layout.layout_item, arrayListItem);
        lvItem.setAdapter(itemAdapter);
    }

    private void findViews() {
        lvItem = findViewById(R.id.listView_typhoon);
        arrayListItem = new ArrayList<>();

        arrayListItem.add(new Item("Megi", "17-18/10/2010", "885hPa", R.drawable.tp1));
        arrayListItem.add(new Item("Songda", "16/05/2011", "920hPa", R.drawable.tp2));
        arrayListItem.add(new Item("Muifa", "30/07/2011", "930hPa", R.drawable.tp3));
        arrayListItem.add(new Item("Nanmadol", "26-27/08/2010", "925hPa", R.drawable.tp4));
    }

}