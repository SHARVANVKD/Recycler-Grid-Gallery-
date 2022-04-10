package com.example.recylerview_grid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class customeAdapter extends RecyclerView.Adapter<customeAdapter.sampleViewHolder> {
    String[] name ;
    int[] photos;
    Context context;
    public customeAdapter(Context applicationContext, String[] names, int[] photos) {
        context = applicationContext;
        name = names;
        this.photos = photos;
    }

    @NonNull
    @Override
    public sampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_demo, parent, false);
        sampleViewHolder viewholder = new sampleViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull sampleViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.text.setText(name[position]);
        holder.image.setImageResource(photos[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,imageViewPage.class);
                intent.putExtra("image",photos[position]);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class sampleViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView text;
        public sampleViewHolder(@NonNull View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.imageView);
            text = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
