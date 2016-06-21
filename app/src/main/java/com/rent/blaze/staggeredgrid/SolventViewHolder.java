package com.rent.blaze.staggeredgrid;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by blaze on 5/24/16.
 */
public class SolventViewHolder extends RecyclerView.ViewHolder {

    public ImageView ivSolventPhoto;
    public TextView tvSolventName;

    public SolventViewHolder(View itemView) {
        super(itemView);
        ivSolventPhoto = (ImageView) itemView.findViewById(R.id.iv_country_photo);
        tvSolventName = (TextView) itemView.findViewById(R.id.tv_country_name);

    }
}
