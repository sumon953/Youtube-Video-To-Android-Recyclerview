package com.example.youtubevideotoandroidrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class YoutubeAdapter extends RecyclerView.Adapter<YoutubeViewHolder> {

    ArrayList<DataSetList> list;
    Context context;

    public YoutubeAdapter() {
    }

    public YoutubeAdapter(ArrayList<DataSetList> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public YoutubeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.video_per_row,parent,false);
        YoutubeViewHolder youtubeViewHolder = new YoutubeViewHolder(view);

        return youtubeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull YoutubeViewHolder holder, int position) {

        final DataSetList currentdata = list.get(position);

        holder.webView.loadUrl(currentdata.getLink());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  i = new Intent(context,VideoFullScreen.class);
                i.putExtra("lnk",currentdata.getLink());
                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
