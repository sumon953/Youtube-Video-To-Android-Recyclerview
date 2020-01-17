package com.example.youtubevideotoandroidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VideoFullScreen extends AppCompatActivity {

    WebView full;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_full_screen);

        full = findViewById(R.id.fullvideo);
        String Link = getIntent().getStringExtra("link");
        full.loadUrl(Link);

        //Webview;
        full.setWebViewClient(new WebViewClient());
        full.setWebChromeClient(new WebChromeClient());
        full.getSettings().setJavaScriptEnabled(true);

    }
}
