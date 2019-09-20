package com.padcmyanmar.padc9.countrylistwithcoil.viewholders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by aung on 12/2/17.
 */

public abstract class BaseViewHolder<W> extends RecyclerView.ViewHolder implements View.OnClickListener {

    protected W mData;

    public BaseViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    public abstract void setData(W data);
}
