package com.example.lesson2practica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> groupList = new ArrayList<>();
    private RecyclerView rvGroupList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addValue();

        rvGroupList = findViewById(R.id.rv_group);
        GroupAdapter groupAdapter = new GroupAdapter(groupList);
        rvGroupList.setAdapter(groupAdapter);
    }

    private void addValue() {
        groupList.add("namey");
        groupList.add("namej");
        groupList.add("nameh");
        groupList.add("namef");
        groupList.add("namek");
        groupList.add("named");
        groupList.add("namex");
        groupList.add("namez");
        groupList.add("namea");
        groupList.add("namer");
        groupList.add("nameu");

    }
}
