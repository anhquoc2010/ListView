package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvItem;
    ArrayList<Item> arrayListItem;
    ItemAdapter itemAdapter;
    ImageButton addItem;
    EditText name;
    EditText date;
    EditText pressure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        itemAdapter = new ItemAdapter(this, R.layout.layout_item, arrayListItem);
        lvItem.setAdapter(itemAdapter);

        addItem.setOnClickListener(v->{
            Item newItem = new Item(name.getText().toString(), date.getText().toString(), pressure.getText().toString(), R.drawable.tp4);

            arrayListItem.add(newItem);
            itemAdapter.notifyDataSetChanged();
        });

//        lvItem.setOnLongClickListener((View.OnLongClickListener) (adapterView, view, i, l) -> {
//
//            arrayListItem.remove(i);
//            itemAdapter.notifyDataSetChanged();
//            return false;
//        });
    }

    private void findViews() {
        addItem = findViewById(R.id.imageView_add);
        name = findViewById(R.id.et_name);
        date = findViewById(R.id.et_date);
        pressure = findViewById(R.id.et_pressure);

        lvItem = findViewById(R.id.listView_typhoon);
        arrayListItem = new ArrayList<>();

        arrayListItem.add(new Item("Megi", "17-18/10/2010", "885hPa", R.drawable.tp1));
        arrayListItem.add(new Item("Songda", "16/05/2011", "920hPa", R.drawable.tp2));
        arrayListItem.add(new Item("Muifa", "30/07/2011", "930hPa", R.drawable.tp3));
//        arrayListItem.add(new Item("Nanmadol", "26-27/08/2010", "925hPa", R.drawable.tp4));
    }
}