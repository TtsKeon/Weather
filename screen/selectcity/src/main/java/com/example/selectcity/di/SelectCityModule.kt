package com.example.selectcity.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.core.viewModel.ViewModelKey
import com.example.core.viewModel.WeatherViewModelFactory
import com.example.selectcity.domain.LocationInteractor
import com.example.selectcity.domain.LocationInteractorImpl
import com.example.selectcity.presentation.locationslList.LocationsListViewModel
import com.example.selectcity.presentation.search.SelectCityViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Provider

@Module
interface SelectCityModule {

    companion object {

        @Provides
        @JvmStatic
        fun bindFeedViewModelFactory(
            creators: Map<Class<out ViewModel>,
                    @JvmSuppressWildcards Provider<ViewModel>>
        ): ViewModelProvider.Factory = WeatherViewModelFactory(creators)

    }

    @Binds
    @IntoMap
    @ViewModelKey(SelectCityViewModel::class)
    fun bindWeatherViewModel(viewModel: SelectCityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LocationsListViewModel::class)
    fun bindLocationsListViewModel(viewModel: LocationsListViewModel): ViewModel

    @Binds
    fun bindLocationInteractor(locationInteractorImpl: LocationInteractorImpl): LocationInteractor
}