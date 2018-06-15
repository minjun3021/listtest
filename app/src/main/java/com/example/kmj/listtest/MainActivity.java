package com.example.kmj.listtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Data> item = new ArrayList<>();
    ListView listview;
    ListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.listview);
        item.add(new Data("Big","Small"));
        item.add(new Data("apple","good"));
        item.add(new Data("mac","qwer"));
        mAdapter=new ListAdapter(item);
        listview.setAdapter(mAdapter);

    }
}
