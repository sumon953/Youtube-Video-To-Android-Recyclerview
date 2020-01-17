package com.example.youtubevideotoandroidrecyclerview;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class YoutubeViewHolder extends RecyclerView.ViewHolder {

    WebView webView;
    Button button;
    public YoutubeViewHolder(@NonNull View itemView) {
        super(itemView);

        webView = itemView.findViewById(R.id.videoview);
        button = itemView.findViewById(R.id.fullscreen);

        //Webview;
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);



    }
}
