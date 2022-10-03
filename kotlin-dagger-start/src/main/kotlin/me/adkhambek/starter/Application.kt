package me.adkhambek.starter

import io.vertx.core.Vertx
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Application @Inject constructor(
    private val vertx: Vertx,
    private val mainVerticle: MainVerticle,
) {

    fun start() {
        vertx.deployVerticle(mainVerticle)
    }
}
