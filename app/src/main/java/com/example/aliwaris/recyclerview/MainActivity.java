package com.example.aliwaris.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     private LinearLayoutManager linearLayoutManager;
     private ModelAdaptor modelAdaptor;
     private List<ModelClass> list;
     private RecyclerView recyclerView;
     private String names[]={"Pink","Red","Amber","Blue","Brown","Cyan","Deep Purple","Deep Orange","Green","Indigo",
     "Light Blue","Light Green","Lime","Orange","Purple","Teal","Yellow"
     };
     private int imgs[]={R.drawable.pink,R.drawable.red,R.drawable.amber,R.drawable.blue,R.drawable.brown,R.drawable.cyan,
     R.drawable.deeppurple,R.drawable.depporange,R.drawable.green,R.drawable.indigo,R.drawable.lightblue,R.drawable.lightgreen,
     R.drawable.lime,R.drawable.orange,R.drawable.purple,R.drawable.teal,R.drawable.yellow
     };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rview);
        list=new ArrayList<>();
        modelAdaptor=new ModelAdaptor(this,list);
        linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(modelAdaptor);
        recyclerView.setLayoutManager(linearLayoutManager);
        for(int i=0;i<17;i++){
            list.add(new ModelClass(names[i],imgs[i]));
        }



    }

}
