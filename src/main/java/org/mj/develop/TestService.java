package org.mj.develop;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    EntityManager em;

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {

        Member member = new Member(1l, "a");

        em.persist(member);
        em.detach(member);
        em.remove(member);

        return memberRepository.findAll(); //멤버 목록 조회
    }
}
