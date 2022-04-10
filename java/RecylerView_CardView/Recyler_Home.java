package RecylerView_CardView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recylerview_grid.R;

public class Recyler_Home extends AppCompatActivity {

    String[] Names = {"aaa","bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc","aaa",
            "bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc","aaa","bbb","ccc",};
    int[] photos = {R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,
            R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2
            ,R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,R.drawable.iphone , R.drawable.nature , R.drawable.nature1,R.drawable.nature2,R.drawable.iphone , R.drawable.nature};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyler_home);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter Adapters = new  CustomAdapter(Recyler_Home.this, photos,Names);
        recyclerView.setAdapter(Adapters);

    }
}