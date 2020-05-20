package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 1"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 2"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 3"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 4"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 5"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 6"));

        Adapter adapter = new Adapter(this,modelClassList);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}
