package com.example.googlesearch.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.googlesearch.R;
import com.example.googlesearch.pojo.Item;

import java.util.List;


public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> {

    private List<Item> itemsList;

    public List<Item> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.response_items, parent, false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
        Item item = itemsList.get(position);
        holder.textViewTitle.setText(item.getTitle());
        holder.textViewLink.setText(item.getHtmlFormattedUrl());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }


    class ItemsViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewTitle;
        private TextView textViewLink;

        ItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewLink = itemView.findViewById(R.id.textViewLink);
        }
    }


}
