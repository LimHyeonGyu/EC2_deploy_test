package edu.example.deploytest.controller

import edu.example.deploytest.dto.MemberRequestDTO
import edu.example.deploytest.dto.MemberResponseDTO
import edu.example.deploytest.service.MemberService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/member")
class MemberController(
    private val memberService: MemberService
) {
    @PostMapping
    fun create(@RequestBody memberRequestDTO: MemberRequestDTO): ResponseEntity<MemberResponseDTO> {
        return ResponseEntity.ok(memberService.create(memberRequestDTO))
    }

    @GetMapping("/{memberId}")
    fun read(@PathVariable memberId: String): ResponseEntity<MemberResponseDTO> {
        return ResponseEntity.ok(memberService.read(memberId))
    }

}