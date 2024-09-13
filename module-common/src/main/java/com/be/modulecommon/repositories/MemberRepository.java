package com.be.modulecommon.repositories;

import com.be.modulecommon.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
