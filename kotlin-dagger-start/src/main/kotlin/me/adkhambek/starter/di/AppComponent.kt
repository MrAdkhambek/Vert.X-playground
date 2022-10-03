package me.adkhambek.starter.di

import dagger.Component
import me.adkhambek.starter.Application
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        CoreModule::class
    ]
)
internal interface AppComponent {

    val application: Application
}
