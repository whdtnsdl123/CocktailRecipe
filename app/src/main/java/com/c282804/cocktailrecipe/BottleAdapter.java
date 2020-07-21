package com.c282804.cocktailrecipe;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BottleAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<Item> items;


    public BottleAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }




    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View itemView= inflater.inflate(R.layout.bottle_item,parent,false);

        VH holder = new VH(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh= (VH)holder;

        Item item=items.get(position);

        vh.tvTitle.setText(item.name );
        Glide.with(context).load(item.iv).into(vh.iv);




    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private class VH extends RecyclerView.ViewHolder {

        TextView tvTitle;
        ImageView iv;

        public VH(View itemView) {

            super(itemView);

            iv=itemView.findViewById(R.id.iv);
            tvTitle=itemView.findViewById(R.id.tv_name);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Item item= items.get(getLayoutPosition());

                    Intent intent= new Intent(context,DetailActivity.class);

                    intent.putExtra("Name",item.name);
                    intent.putExtra("msg",item.iv);


                    if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation((Activity) context,new Pair<View, String>(iv,"IMG"));
                        context.startActivity(intent,options.toBundle());

                    }else {
                        context.startActivity(intent);
                    }


                }
            });
        }
    }
}
