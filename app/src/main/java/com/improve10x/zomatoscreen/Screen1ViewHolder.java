package com.improve10x.zomatoscreen;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Screen1ViewHolder extends RecyclerView.ViewHolder {
    public ImageView biriyaniIv;
    public TextView promotedTxt;
    public TextView offerTxt;
    public TextView rupeesOfferTxt;
    public TextView minTxt;
    public TextView foodNameTxt;
    public TextView subFoodNameTxt;
    public TextView ratingTxt;
    public TextView rupeesForMeTxt;
    public Screen1ViewHolder(@NonNull View itemView) {
        super(itemView);
        biriyaniIv = itemView.findViewById(R.id.biriyani_iv);
        promotedTxt = itemView.findViewById(R.id.promoted_txt);
        offerTxt = itemView.findViewById(R.id.offer_txt);
        rupeesForMeTxt = itemView.findViewById(R.id.rupeesforme_txt);
        rupeesOfferTxt = itemView.findViewById(R.id.rupees_offer_txt);
        minTxt = itemView.findViewById(R.id.min_txt);
        foodNameTxt = itemView.findViewById(R.id.foodname_txt);
        subFoodNameTxt = itemView.findViewById(R.id.subfoodname_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
    }
}
