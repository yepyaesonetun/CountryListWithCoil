package com.padcmyanmar.padc9.countrylistwithcoil.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padc9.countrylistwithcoil.R
import com.padcmyanmar.padc9.countrylistwithcoil.data.vos.CountryVO
import com.padcmyanmar.padc9.countrylistwithcoil.viewholders.CountryViewHolder

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-09-20.
 */

class CountryListRVAdapter(context: Context) : BaseRecyclerAdapter<CountryViewHolder, CountryVO>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return CountryViewHolder(view)
    }
}