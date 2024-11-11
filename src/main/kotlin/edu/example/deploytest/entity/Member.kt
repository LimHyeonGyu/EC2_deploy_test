package edu.example.deploytest.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Member(
    @Id
    var memberId: String? = null,
    var password: String? = null,
    var name: String? = null,
    var email: String? = null,
    var address: String? = null,
    var phone: String? = null
)