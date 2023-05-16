package com.example.selectcity.domain

import android.database.Observable
import com.example.selectcity.domain.model.City
import com.example.selectcity.domain.model.Location
import io.reactivex.rxjava3.core.Single

interface LocationInteractor {

    fun getAvailableLocations(): Single<List<Location>>

    fun searchCity(query: String): Single<List<City>>
}