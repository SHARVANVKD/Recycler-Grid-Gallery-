package RecylerView_CardView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recylerview_grid.R;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    String[] Names;
    int[] Photos;
    Context context;
    public CustomAdapter(Recyler_Home recyler_home, int[] photos, String[] names) {
        this.context = recyler_home;
        this.Photos = photos;
        this.Names = names;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design , parent);
        ViewHolder viewHolder =new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtView.setText(Names[position]);
        holder.imgView.setImageResource(Photos[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, img_show_page.class);
                intent.putExtra("image", Photos[position]); // put image data in Intent
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Names.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtView;
        ImageView imgView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtView = (TextView) itemView.findViewById(R.id.textView);
            imgView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
