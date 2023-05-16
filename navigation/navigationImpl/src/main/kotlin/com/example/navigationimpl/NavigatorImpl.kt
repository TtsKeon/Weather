package com.example.navigationimpl

import com.example.navigationapi.screen.Screen
import com.github.terrakok.cicerone.Router
import javax.inject.Inject

class NavigatorImpl<S : Screen> @Inject constructor(
    private val router: Router,
    private val mainScreenMapper: ScreenMapper<S>,
) : com.example.navigationapi.Navigator<S> {

    override fun open(screen: S) {
        router.navigateTo(mainScreenMapper.map(screen))
    }

    override fun clearAndNewRoot(screen: S) {
        router.newRootScreen(mainScreenMapper.map(screen))
    }

    override fun back() {
        router.exit()
    }
}