package example.com.mppLib

import kotlinx.serialization.Serializable

@Serializable
data class Person(
    val firstName: String? = null,
    val lastName: String? = null,
)
