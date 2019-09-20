package com.padcmyanmar.padc9.countrylistwithcoil.viewholders

import android.view.View
import coil.ImageLoader
import coil.api.load
import coil.decode.SvgDecoder
import coil.transform.CircleCropTransformation
import com.padcmyanmar.padc9.countrylistwithcoil.data.vos.CountryVO
import kotlinx.android.synthetic.main.recyclerview_item.view.*

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-09-20.
 */

class CountryViewHolder(itemView: View) : BaseViewHolder<CountryVO>(itemView) {
    override fun setData(data: CountryVO?) {
        itemView.tvCountryName.text = data!!.name
        itemView.tvCapital.text = data!!.capital
        itemView.tvPopulation.text = data.population


        // coil svg loader
        val imageLoader = ImageLoader(itemView.context) {
            componentRegistry {
                add(SvgDecoder())
            }
        }

        // coil load image
        itemView.ivCountryFlag.load(data!!.flag, imageLoader) {
            crossfade(true)
            transformations(CircleCropTransformation())
        }

    }

    override fun onClick(p0: View?) {

    }
}