package edu.example.deploytest.repository

import edu.example.deploytest.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository: JpaRepository<Member?, String?> {
}