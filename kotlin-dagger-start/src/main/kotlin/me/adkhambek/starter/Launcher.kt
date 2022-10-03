package me.adkhambek.starter

import me.adkhambek.starter.di.AppComponent
import me.adkhambek.starter.di.DaggerAppComponent

object Launcher {

    @JvmStatic
    fun main(args: Array<String>) {
        val component: AppComponent = DaggerAppComponent.create()
        val application: Application = component.application
        application.start()
    }
}
