package com.example.project

import example.com.mppLib.Person
import io.kvision.annotations.KVService

@KVService
interface IPingService {
    suspend fun ping(message: String): Person
}
