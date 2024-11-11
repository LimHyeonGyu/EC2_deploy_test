package edu.example.deploytest.service

import edu.example.deploytest.dto.MemberRequestDTO
import edu.example.deploytest.dto.MemberResponseDTO
import edu.example.deploytest.repository.MemberRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    fun create(memberRequestDTO: MemberRequestDTO) =
        MemberResponseDTO(memberRepository.save(memberRequestDTO.toEntity()))

    fun read(memberId: String) =
        memberRepository.findByIdOrNull(memberId)?.let {
            MemberResponseDTO(it)
        } ?: throw NoSuchElementException()

}