package com.example.googlesearch.screens.items;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.googlesearch.R;
import com.example.googlesearch.adapters.ItemsAdapter;
import com.example.googlesearch.pojo.Item;

import java.util.ArrayList;
import java.util.List;


public class SearchActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemsAdapter adapter;
    private ItemsViewModel viewModel;
    public String msg;

    public String getMsg() {
        return msg;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        msg = intent.getStringExtra("textSearch");

        recyclerView = findViewById(R.id.recyclerViewItems);
        adapter = new ItemsAdapter();
        adapter.setItemsList(new ArrayList<>());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        viewModel = ViewModelProviders.of(this).get(ItemsViewModel.class);
        viewModel.getItems().observe(this, new Observer<List<Item>>() {
            @Override
            public void onChanged(List<Item> items) {
                adapter.setItemsList(items);
            }
        });
        viewModel.getErrors().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(Throwable throwable) {
                if (throwable != null) {
                    Toast.makeText(SearchActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    viewModel.clearErrors();
                }
            }
        });
        viewModel.loadData();

    }
}
