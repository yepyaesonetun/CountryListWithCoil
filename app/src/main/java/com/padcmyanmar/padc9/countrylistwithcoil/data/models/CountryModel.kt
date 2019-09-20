package com.padcmyanmar.padc9.countrylistwithcoil.data.models

import android.annotation.SuppressLint
import com.padcmyanmar.padc9.countrylistwithcoil.data.vos.CountryVO
import com.padcmyanmar.padc9.countrylistwithcoil.network.CountryAPI
import com.padcmyanmar.padc9.countrylistwithcoil.utils.RetrofitProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.lang.RuntimeException

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-09-20.
 */

class CountryModel {

    companion object {
        private var sObjInstance: CountryModel? = null
        var mAPI: CountryAPI? = null

        fun initCountryModel() {
            sObjInstance = CountryModel()

            val retrofit = RetrofitProvider.getRetrofit("https://restcountries.eu/")
            mAPI = retrofit.create(CountryAPI::class.java)

        }

        fun getInstance(): CountryModel {
            if (sObjInstance == null) {
                throw RuntimeException("Country Model must invoke before initialized")
            }
            val i = sObjInstance
            return i!!
        }
    }


    @SuppressLint("CheckResult")
    fun loadCountryData(success: (List<CountryVO>) -> Unit, fail: (String) -> Unit) {
        mAPI!!.getAllCountries().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                success(it!!)
            }
    }
}