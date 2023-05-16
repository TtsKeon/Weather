package com.example.selectcity.domain

import com.example.selectcity.domain.model.City
import com.example.selectcity.domain.model.Location
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class LocationInteractorImpl @Inject constructor(): LocationInteractor {
    override fun getAvailableLocations(): Single<List<Location>> {
        return Single.just(listOf(
            Location("Омск"),
            Location("Москва"),
            Location("Томск"),
            Location("Новосибирск"),
        )
        )
    }

    override fun searchCity(query: String): Single<List<City>> {
        TODO("Not yet implemented")
    }
}