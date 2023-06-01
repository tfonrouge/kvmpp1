package com.example.project

import example.com.mppLib.Person

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual class PingService : IPingService {

    override suspend fun ping(message: String): Person {
        println(message)
        return Person("Clint", "Eastwood")
    }
}
