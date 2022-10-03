package me.adkhambek.starter.repository

import io.vertx.core.Vertx
import io.vertx.junit5.VertxExtension
import io.vertx.junit5.VertxTestContext
import me.adkhambek.starter.entity.User
import org.hibernate.cfg.Configuration
import org.hibernate.cfg.Environment
import org.hibernate.reactive.provider.ReactiveServiceRegistryBuilder
import org.hibernate.reactive.stage.Stage
import org.hibernate.service.ServiceRegistry
import org.hibernate.tool.schema.Action
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import java.util.*

@Testcontainers
@ExtendWith(VertxExtension::class)
internal class UserRepositoryImplTest {

    companion object {
        private const val DB_NAME = "hibernatedb"
        private const val DB_USER = "user"
        private const val DB_PASSWORD = "secret"
    }

    @Container
    private val container: PostgreSQLContainer<*> = PostgreSQLContainer("postgres:13-alpine")
        .withDatabaseName(DB_NAME)
        .withUsername(DB_USER)
        .withPassword(DB_PASSWORD)


    private lateinit var repository: UserRepository


    @BeforeEach
    fun setup(vertx: Vertx, context: VertxTestContext) {

        val url: String = "jdbc:postgresql://localhost:${container.firstMappedPort}/$DB_NAME"

        val hibernateProps = Properties()
        hibernateProps[Environment.URL] = url
        hibernateProps[Environment.USER] = DB_USER
        hibernateProps[Environment.PASS] = DB_PASSWORD
        hibernateProps[Environment.HBM2DDL_DATABASE_ACTION] = Action.CREATE
        hibernateProps[Environment.DIALECT] = "org.hibernate.dialect.PostgreSQL95Dialect"

        val hibernateConfiguration = Configuration()
        hibernateConfiguration.properties = hibernateProps
        hibernateConfiguration.addAnnotatedClass(User::class.java)

        val serviceRegistry: ServiceRegistry = ReactiveServiceRegistryBuilder()
            .applySettings(hibernateConfiguration.properties)
            .build()

        val sessionFactory: Stage.SessionFactory = hibernateConfiguration
            .buildSessionFactory(serviceRegistry)
            .unwrap(Stage.SessionFactory::class.java)

        repository = UserRepositoryImpl(sessionFactory)
        context.completeNow()
    }

    @Test
    fun `test insert user`(vertx: Vertx, context: VertxTestContext) {
        val user: User = User("Adam")

        context.verify {
            repository.save(user)
                .onFailure { err -> context.failNow(err) }
                .onSuccess { result ->
                    Assertions.assertNotNull(result)
                    Assertions.assertNotNull(result.id)
                    Assertions.assertEquals(1, result.id)
                    context.completeNow()
                }
        }
    }
}
