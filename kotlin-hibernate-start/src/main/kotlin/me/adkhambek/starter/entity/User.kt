package me.adkhambek.starter.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class User {

    @Id
    @GeneratedValue
    var id: Long? = null

    var name: String? = null

    constructor(name: String?) {
        this.name = name
    }

    constructor()
}
