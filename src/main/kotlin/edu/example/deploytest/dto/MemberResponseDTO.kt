package edu.example.deploytest.dto

import edu.example.deploytest.entity.Member

data class MemberResponseDTO(
    val memberId: String?,
    val password: String?,
    val name: String?,
    val email: String?,
    val address: String?,
    var phone: String?
) {
    constructor(member: Member): this (
        memberId = member.memberId,
        password = member.password,
        name = member.name,
        email = member.email,
        address = member.address,
        phone = member.phone
    )


}