package me.adkhambek.starter

import io.vertx.kotlin.coroutines.CoroutineVerticle
import io.vertx.kotlin.coroutines.await
import javax.inject.Inject

class MainVerticle @Inject constructor() : CoroutineVerticle() {

    override suspend fun start() {

        vertx
            .createHttpServer()
            .requestHandler { req ->
                req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello from Vert.x!")
            }.listen(8888).await()
        println("HTTP server started on port 8888")
    }
}
