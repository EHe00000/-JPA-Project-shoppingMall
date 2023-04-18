package com.slacker.member.repository;

import com.slacker.domain.Member;
import com.slacker.member.dto.MemberDTO;
import org.modelmapper.ModelMapper;
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

    private final ModelMapper modelMapper;

    public MemberRepository(ModelMapper modelMapper)
    {
        this.modelMapper = modelMapper;
    }

    @Transactional
    public void save(Member member){
        em.persist(member);
    }

    @Transactional
    public List<Member> findAllMember(){
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }

    public MemberDTO find(MemberDTO member)
    {
        Member m = em.find(Member.class,member.getMemberId());

        if(m != null)
            return modelMapper.map(m,MemberDTO.class);
        else
            return null;
    }
}
