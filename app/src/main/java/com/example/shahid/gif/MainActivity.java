package com.example.shahid.gif;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GifImageView gifImageView;
        gifImageView=findViewById(R.id.i);
        gifImageView.setImageResource(R.drawable.brother);
    }

}
