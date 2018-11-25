package com.example.aliwaris.recyclerview;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;



public class ModelAdaptor extends RecyclerView.Adapter<ModelAdaptor.ModelViewHolder> {
    Context context;
    List<ModelClass> list;
    MainActivity main;
    public ModelAdaptor(Context context, List<ModelClass> list) {
        this.context = context;
        this.list = list;
    }



    @Override
    public ModelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.data_layout,parent,false);
        return new ModelViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ModelViewHolder holder, final int position) {
      holder.name.setText(list.get(position).getName());
        holder.img.setImageResource(list.get(position).getImg());
        holder.cardView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(context,list.get(position).getName(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class ModelViewHolder extends RecyclerView.ViewHolder{
          TextView name;
          ImageView img;
            CardView cardView;
        public ModelViewHolder(View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.name);
            img=(ImageView)itemView.findViewById(R.id.img);
            cardView=itemView.findViewById(R.id.cardview);

        }
    }

}
