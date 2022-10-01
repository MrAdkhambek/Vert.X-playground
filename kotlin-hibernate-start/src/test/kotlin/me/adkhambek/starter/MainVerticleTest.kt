package me.adkhambek.starter

import io.vertx.core.Vertx
import io.vertx.junit5.VertxExtension
import io.vertx.junit5.VertxTestContext
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(VertxExtension::class)
internal class MainVerticleTest {

    @BeforeEach
    fun `test deploy main verticle start`(vertx: Vertx, testContext: VertxTestContext) {
        vertx.deployVerticle(MainVerticle(), testContext.succeeding { testContext.completeNow() })
    }

    @Test
    @Throws(Throwable::class)
    fun `test deploy main verticle`(vertx: Vertx, testContext: VertxTestContext) {
        testContext.completeNow()
    }
}
