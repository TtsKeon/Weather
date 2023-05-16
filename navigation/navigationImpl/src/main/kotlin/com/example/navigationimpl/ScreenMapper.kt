package com.example.navigationimpl

import com.example.navigationapi.screen.Screen
import com.github.terrakok.cicerone.androidx.FragmentScreen

interface ScreenMapper<S: Screen> {
    fun map(screen: S): FragmentScreen
}