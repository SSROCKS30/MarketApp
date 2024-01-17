package com.example.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //1) Adapter View
    RecyclerView recyclerView;
    //2) Data Set
    List<Item> itemList;
    // 3) Adapter
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        itemList = new ArrayList<>();
        Item item1 = new Item(R.drawable.fruit, "Fruits", "Fresh Fruits from the garden" );
        Item item2 = new Item(R.drawable.vegitables, "Vegetable", "Delicious Vegetable");
        Item item3 = new Item(R.drawable.bread, "Bakery", "Bread, White and Beans");
        Item item4 = new Item(R.drawable.beverage, "Beverage", "Juice, Tea, Coffee, Soda");
        Item item5 = new Item(R.drawable.milk, "Milk", "Fresh Milk");
        Item item6 = new Item(R.drawable.popcorn, "Snacks", "Popcorn and Soda");
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);
    }
}