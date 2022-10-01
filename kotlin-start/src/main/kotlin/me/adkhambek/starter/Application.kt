package me.adkhambek.starter

import io.vertx.core.Verticle
import io.vertx.core.Vertx

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        val verticle: Verticle = MainVerticle()

        val vertX: Vertx = Vertx.vertx()
        vertX.deployVerticle(verticle)
    }
}
