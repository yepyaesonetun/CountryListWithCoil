package com.padcmyanmar.padc9.countrylistwithcoil.activities

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padc9.countrylistwithcoil.R
import com.padcmyanmar.padc9.countrylistwithcoil.adapters.CountryListRVAdapter
import com.padcmyanmar.padc9.countrylistwithcoil.data.models.CountryModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.hasFixedSize()
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val rvAdapter = CountryListRVAdapter(context = this)
        recyclerView.adapter = rvAdapter

        CountryModel.getInstance().loadCountryData(success = {
            progressBar.visibility = View.GONE
            rvAdapter.appendNewData(it)
        }, fail = {
            Log.i("FAIL", it)
            progressBar.visibility = View.GONE
        })

    }
}
