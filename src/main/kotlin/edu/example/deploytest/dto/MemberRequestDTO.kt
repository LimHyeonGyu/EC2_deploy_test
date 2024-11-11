package edu.example.deploytest.dto

import edu.example.deploytest.entity.Member

data class MemberRequestDTO(
    val memberId: String?,
    val password: String?,
    val name: String?,
    val email: String?,
    val address: String?,
    val phone: String?
) {
    fun toEntity(): Member = Member(
        memberId = memberId,
        password = password,
        name = name,
        email = email,
        address = address,
        phone = phone
    )
}