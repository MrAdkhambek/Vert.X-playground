package me.adkhambek.starter

import dagger.Component
import me.adkhambek.starter.di.AppComponent
import me.adkhambek.starter.di.CoreModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        CoreModule::class
    ]
)
internal interface TestAppComponent : AppComponent {

    val mainVerticle: MainVerticle

    fun inject(test: MainVerticleTest)
}
