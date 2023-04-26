package com.example.recycleviewassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class myAdapter extends RecyclerView.Adapter<myAdapter.holder> {

    String data[];
    int images[];

    public myAdapter(String[]data,int[]images){
        this.data=data;
        this.images=images;
    }


    @NonNull
    @Override
    public myAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singleitem,parent,false);

        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.holder holder, int position) {

        holder.txt.setText(data[position]);
        holder.img.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class holder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt;

        public holder(@NonNull View itemView){
            super(itemView);

            img=(ImageView)itemView.findViewById(R.id.img1);
            txt=(TextView)itemView.findViewById(R.id.txt1);
        }
    }
}
