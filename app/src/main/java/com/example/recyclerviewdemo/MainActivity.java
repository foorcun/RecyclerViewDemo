package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<ModelClass> modelClassList;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 1"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 2"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 3"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 4"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 5"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "ben titleım 6"));

        adapter = new Adapter(this,modelClassList);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }


    public void ekle(View v) {
        //buraya istediğin kodları gir
        //Toast.makeText(this, "tıklandım", Toast.LENGTH_SHORT).show();

        int position = 0;

        insertitem(position);


    }

    private void insertitem(int position) {
        modelClassList.add(position,new  ModelClass(R.drawable.ic_launcher_background, "ben yeni geldim"));
        // en sona ekler
        // adapter.notifyItemInserted(modelClassList.size());
        //ilk başa ekler
        adapter.notifyItemInserted(position);

    }

    public void cikar(View v) {
        //buraya istediğin kodları gir
        Toast.makeText(this, "tıklandım", Toast.LENGTH_SHORT).show();
        int position = 0;
        removeitem(position);


    }

    private void removeitem(int position) {

        //if ile çıkartılacak item kaldımı kontrolu yapılması gerekiyor

        modelClassList.remove(position);
        //adapter.notifyDataSetChanged();
        adapter.notifyItemRemoved(position);

    }

}
