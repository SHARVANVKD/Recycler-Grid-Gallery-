package RecylerView_CardView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.recylerview_grid.R;

public class img_show_page extends AppCompatActivity {

    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_show_page);

        image = (ImageView) findViewById(R.id.image);
        Intent intent = getIntent();
        image.setImageResource(intent.getIntExtra("image", 0));
    }
}