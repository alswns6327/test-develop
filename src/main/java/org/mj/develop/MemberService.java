package org.mj.develop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void test(){
        memberRepository.save(new Member(1L, "test"));

        Optional<Member> member = memberRepository.findById(1L);
        List<Member> members = memberRepository.findAll();


        memberRepository.deleteById(1L);
    }

}
