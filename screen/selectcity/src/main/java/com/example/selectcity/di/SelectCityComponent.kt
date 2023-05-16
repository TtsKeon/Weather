package com.example.selectcity.di

import com.example.selectcity.presentation.locationslList.LocationsListFragment
import com.example.selectcity.presentation.search.SelectCityFragment
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [SelectCityModule::class],
    dependencies = [SelectCityComponentDependencies::class]
)
@Singleton
interface SelectCityComponent {
    fun inject(fragment: SelectCityFragment)
    fun inject(fragment: LocationsListFragment)
}