package com.example.selectcity.di

import com.example.core.di.ComponentDependencies
import com.example.navigationapi.Navigator
import com.example.navigationapi.screen.Screen
import retrofit2.Retrofit

interface SelectCityComponentDependencies: ComponentDependencies {

//    fun provideRetrofit(): Retrofit
    fun provideNavigator(): Navigator<Screen>
}