package com.example.recylerview_grid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class imageViewPage extends AppCompatActivity {
ImageView selectedImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_page);

        selectedImage = (ImageView) findViewById(R.id.imageView2);
        Intent intent = getIntent();
        selectedImage.setImageResource(intent.getIntExtra("image", 0));
    }
}