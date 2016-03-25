package com.example.dell.web;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.File;

public class Camera1 extends AppCompatActivity {
    ImageView imageView;
    Intent camera_intent;
    File file;
    static final int CAM_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera1);
        camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        file = getFile();
        camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
        startActivityForResult(camera_intent, CAM_REQUEST);


    }

    private File getFile() {

        File folder = new File("sdcard/flashback");
        if (!folder.exists()) {
            folder.mkdir();
        }

        File image_file = new File(folder, " image.jpg");
        return image_file;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String path = "sdcard/flashback/image.jpg";
        //
        Intent in =new Intent(getApplicationContext(),VView.class);
        startActivity(in);
    }

}