package com.padcmyanmar.padc9.countrylistwithcoil.network

import com.padcmyanmar.padc9.countrylistwithcoil.data.vos.CountryVO
import io.reactivex.Observable
import retrofit2.http.GET
import java.util.ArrayList

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-09-20.
 */

interface CountryAPI {

    @GET("/rest/v2/all?fields=name;capital;currencies;population;flag")
    fun getAllCountries(): Observable<ArrayList<CountryVO>>
}