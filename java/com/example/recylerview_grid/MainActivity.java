package com.example.recylerview_grid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    String[] Names = {"aaa","bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc","aaa",
            "bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc",};
    int[] photos = {R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,
            R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2
    ,R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,R.drawable.iphone , R.drawable.nature};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViews);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

        customeAdapter adapter = new customeAdapter(getApplicationContext(),Names,photos);
        recyclerView.setAdapter(adapter);
    }
}