package me.adkhambek.starter.repository

import io.vertx.core.Future
import me.adkhambek.starter.entity.User

interface UserRepository {

    fun save(user: User): Future<User>
}
