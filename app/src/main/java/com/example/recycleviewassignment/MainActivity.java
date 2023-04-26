package com.example.recycleviewassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    RecyclerView rcv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv=(RecyclerView) findViewById(R.id.rcv1);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        int[]images={R.drawable.dog,R.drawable.cat,R.drawable.horse,R.drawable.mouse,R.drawable.bird,R.drawable.lion,R.drawable.tiger};
        String arr[]={"dog","cat","horse","mouse","bird","lion","tiger"};

        rcv.setAdapter(new myAdapter(arr,images));
    }
}