package com.example.selectcity.di

import androidx.fragment.app.Fragment
import com.example.core.di.SingletonHolder
import com.example.core.di.findComponentDependencies

internal object SelectCityFeatureHolder: SingletonHolder<SelectCityComponent, Fragment>({
    DaggerSelectCityComponent.builder()
        .selectCityComponentDependencies(it.findComponentDependencies())
        .build()
})
