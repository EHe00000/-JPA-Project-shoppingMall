package com.slacker.domainTest;

import com.slacker.domain.Member;
import com.slacker.member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Random;

@SpringBootTest
public class memberTest {

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    @Rollback(value = false)
    @Transactional
    public void Member_JPA_데이터_추가_메소드(){
        Member member = new Member();
        Random rand = new Random();

        for(int i = 0; i<30; i++){
            member.setMemberId("user" + i);
            member.setMember_pw("pass" + i);
            member.setMemberAge(rand.nextInt(30) + 20);

            System.out.println(member.getMemberId() + " : " + member.getMemberAge());

            memberRepository.save(member);
        }
    }

//    @Test
//    public void Member_JPA_테스트(){
//
//    }
}
