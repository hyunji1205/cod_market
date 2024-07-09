package com.cod.market.member.repository;

import com.cod.market.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface MemberRepository extends JpaRepository<Member, Long> {
}
