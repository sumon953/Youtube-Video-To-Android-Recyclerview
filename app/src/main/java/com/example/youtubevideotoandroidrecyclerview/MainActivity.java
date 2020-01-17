package com.example.youtubevideotoandroidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<DataSetList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RecyclerView Related Work;
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //ArrayList;
        arrayList = new ArrayList<DataSetList>();
        DataSetList dataSetList = new DataSetList("https://www.youtube.com/embed/1GeEOnvyyTU");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/1GeEOnvyyTU");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/1GeEOnvyyTU");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/1GeEOnvyyTU");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/1GeEOnvyyTU");
        arrayList.add(dataSetList);



        //YoutubeAdapter Instance Create;
       YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,getApplicationContext());
       recyclerView.setAdapter(youtubeAdapter);


    }
}
