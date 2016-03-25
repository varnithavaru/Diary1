package com.example.dell.web;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class VView extends AppCompatActivity {
    ImageView imageView;
    public Camera1 p;
    Camera1 path;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vview);

        p=path;

        imageView.setImageDrawable(Drawable.createFromPath(String.valueOf(p)));
    }}
