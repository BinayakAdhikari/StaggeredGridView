package com.rent.blaze.staggeredgrid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by blaze on 5/24/16.
 */
public class SolventRecyclerViewAdapter extends RecyclerView.Adapter<SolventViewHolder> {

    private List<ItemObjects> itemList;
    private Context context;

    public SolventRecyclerViewAdapter(Context context, List<ItemObjects> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public SolventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlist,null);
        SolventViewHolder rcvViewholder = new SolventViewHolder(layoutView);
        return rcvViewholder;
    }

    @Override
    public void onBindViewHolder(SolventViewHolder holder, int position) {
        holder.tvSolventName.setText(itemList.get(position).getName());
        holder.ivSolventPhoto.setImageResource(itemList.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}


