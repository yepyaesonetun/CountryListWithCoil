package com.padcmyanmar.padc9.countrylistwithcoil.root

import android.app.Application
import com.padcmyanmar.padc9.countrylistwithcoil.data.models.CountryModel

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-09-20.
 */

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        CountryModel.initCountryModel()
    }
}