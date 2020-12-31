package com.example.myvideoviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView)findViewById(R.id.videoViewId);

        //Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.jony_thumb);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bella_chao);

        MediaController mediaController = new MediaController(this);

        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setMediaController(mediaController);

    }
}