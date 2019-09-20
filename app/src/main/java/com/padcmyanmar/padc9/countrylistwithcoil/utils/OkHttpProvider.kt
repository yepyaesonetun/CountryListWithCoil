package com.padcmyanmar.padc9.countrylistwithcoil.utils

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class
OkHttpProvider {
    companion object {
        fun getOkHttp(): OkHttpClient {
            return OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build()
        }
    }
}