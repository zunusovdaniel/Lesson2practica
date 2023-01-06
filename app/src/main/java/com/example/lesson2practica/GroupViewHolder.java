package com.example.lesson2practica;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GroupViewHolder extends RecyclerView.ViewHolder {
    private TextView tvGroup;

    public GroupViewHolder(@NonNull View itemView) {
        super(itemView);

        tvGroup = itemView.findViewById(R.id.tv_group);
    }
    public void bind(String name){
        tvGroup.setText(name);
    }
}
