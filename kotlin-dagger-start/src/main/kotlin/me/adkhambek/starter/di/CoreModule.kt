package me.adkhambek.starter.di

import dagger.Module
import dagger.Provides
import io.vertx.core.Vertx
import javax.inject.Singleton

@Module
internal object CoreModule {

    @[Provides Singleton]
    fun provideVertX(): Vertx {
        return Vertx.vertx()
    }
}
