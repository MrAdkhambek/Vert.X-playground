package me.adkhambek.starter.repository

import io.vertx.core.Future
import me.adkhambek.starter.entity.User
import org.hibernate.reactive.stage.Stage

class UserRepositoryImpl constructor(
    private val sessionFactory: Stage.SessionFactory,
) : UserRepository {

    override fun save(user: User): Future<User> {
        val result = sessionFactory.withTransaction { session, _ ->
            session.persist(user)
        }

        return Future.fromCompletionStage(result).map(user)
    }
}
