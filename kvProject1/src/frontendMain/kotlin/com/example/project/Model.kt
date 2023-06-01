package com.example.project

import example.com.mppLib.Person
import io.kvision.remote.getService

object Model {

    private val pingService = getService<IPingService>()

    suspend fun ping(message: String): Person {
        return pingService.ping(message)
    }
}
