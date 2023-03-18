package com.slacker.member.repository;

import com.slacker.domain.Member;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Member member){
        em.persist(member);
    }

    @Transactional
    public List<Member> findAllMember(){
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }
}
