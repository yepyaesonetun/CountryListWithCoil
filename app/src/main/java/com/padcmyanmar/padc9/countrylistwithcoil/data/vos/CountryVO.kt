package com.padcmyanmar.padc9.countrylistwithcoil.data.vos

import com.google.gson.annotations.SerializedName

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-09-20.
 */

data class CountryVO(
    @SerializedName("name")
    var name: String = "",

    @SerializedName("capital")
    var capital: String = "",

    @SerializedName("flag")
    var flag: String = "",

    @SerializedName("population")
    var population: String = ""
)