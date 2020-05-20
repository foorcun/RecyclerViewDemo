package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    //0
    Context context;


    private List<ModelClass> modelClassList;

    public Adapter(Context ct, List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
        context = ct;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Viewholder viewholder, int position) {

        int resource = modelClassList.get(position).getImageIcon();
        final String title = modelClassList.get(position).getTitle();

        viewholder.setData(resource, title);

        //
        // 3 viewholder.itemLayout.setOn
        viewholder.itemLayout.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText( context, title, Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView title;
        //1
        ConstraintLayout itemLayout;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.textTitle);
            //2
            itemLayout = itemView.findViewById(R.id.itemLayout);

        }

        private void setData(int imageResource, String titleText) {

            imageView.setImageResource(imageResource);
            title.setText(titleText);
        }
    }
}
