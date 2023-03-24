package com.improve10x.zomatoscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class Screen1Adapter extends RecyclerView.Adapter<Screen1ViewHolder> {
    ScreenItems[] items;
    public Screen1Adapter(ScreenItems[] screenItems){
        items = screenItems;
    }

    @NonNull
    @Override
    public Screen1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.screen1_listitem,parent,false);
        Screen1ViewHolder holder = new Screen1ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Screen1ViewHolder holder, int position) {
        ScreenItems screenItems = items[position];
        holder.promotedTxt.setText(screenItems.promoted);
        holder.offerTxt.setText(screenItems.offerPercentage);
        holder.rupeesOfferTxt.setText(screenItems.rupeeOffer);
        holder.minTxt.setText(screenItems.deliveryTime);
        holder.foodNameTxt.setText(screenItems.foodName);
        holder.subFoodNameTxt.setText(screenItems.subFoodName);
        holder.ratingTxt.setText(screenItems.rating);
        holder.rupeesForMeTxt.setText(screenItems.rupeesForMe);
        Picasso.get().load(screenItems.foodUrl).into(holder.biriyaniIv);

    }


    @Override
    public int getItemCount() {
        return items.length;
    }
}
