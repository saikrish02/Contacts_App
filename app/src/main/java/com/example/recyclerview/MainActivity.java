package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ModelClass>list ;
    Adapter adapter;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();
    }
    public void initData()
    {
        list = new ArrayList<>();
        list.add(new ModelClass(R.drawable.img, "Sai Krishna", "9:30", "+91 6304849874", "____________________________________________________"));
        list.add(new ModelClass(R.drawable.img_1, "Vignesh", "9:45", "+91 8688405170", "____________________________________________________"));
        list.add(new ModelClass(R.drawable.img_2, "Vignesh 2", "9:47", "+91 7780525588", "____________________________________________________"));
        list.add(new ModelClass(R.drawable.img_3, "Appa", "9:53", "+91 9848320215", "____________________________________________________"));
        list.add(new ModelClass(R.drawable.img, "Amma", "10:03", "+91 9393520215", "____________________________________________________"));
        list.add(new ModelClass(R.drawable.img_1, "Amma 2", "10:24", "+91 7671917688", "____________________________________________________"));
        list.add(new ModelClass(R.drawable.img_2, "Amma 2", "10:24", "+91 7671917688", "____________________________________________________"));
        list.add(new ModelClass(R.drawable.img_3, "Amma 2", "10:24", "+91 7671917688", "____________________________________________________"));
        list.add(new ModelClass(R.drawable.img, "Amma 2", "10:24", "+91 7671917688", "____________________________________________________"));

    }
    public void initRecyclerView()
    {
        recyclerView = findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new Adapter(MainActivity.this, list);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}