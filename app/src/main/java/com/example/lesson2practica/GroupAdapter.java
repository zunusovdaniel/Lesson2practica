package com.example.lesson2practica;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class GroupAdapter extends RecyclerView.Adapter<GroupViewHolder> {
    private ArrayList<String> listName;

    public GroupAdapter(ArrayList<String> listName) {
        this.listName = listName;

    }


    @NonNull
    @Override
    public GroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroupViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_group, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroupViewHolder holder, int position) {
        holder.bind(listName.get(position));
    }

    @Override
    public int getItemCount() {
        return listName.size();
    }
}
