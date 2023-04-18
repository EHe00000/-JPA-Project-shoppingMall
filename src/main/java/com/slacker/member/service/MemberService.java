package com.slacker.member.service;

import com.slacker.member.dto.MemberDTO;
import com.slacker.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService
{
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository)
    {
        this.memberRepository = memberRepository;
    }

    public MemberDTO find(MemberDTO member)
    {
        MemberDTO m = memberRepository.find(member);

        return m;
    }
}
