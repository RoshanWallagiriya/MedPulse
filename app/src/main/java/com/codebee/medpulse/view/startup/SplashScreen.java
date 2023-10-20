package com.codebee.medpulse.view.startup;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.codebee.medpulse.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView imageView = findViewById(R.id.logo_gif);


        Glide.with(this)
                .asGif()
                .load(R.drawable.logo)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(imageView);

    }
}