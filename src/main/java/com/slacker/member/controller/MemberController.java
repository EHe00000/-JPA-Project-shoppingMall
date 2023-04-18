package com.slacker.member.controller;

import com.slacker.member.dto.MemberDTO;
import com.slacker.member.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController
{
    private final MemberService memberService;

    public MemberController(MemberService memberService)
    {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String loginPage() { return "/member/login"; }

    @GetMapping("/user-login")
    public String login(@ModelAttribute MemberDTO member, Model model)
    {
        MemberDTO m = memberService.find(member);

        if(m != null)
        {
            model.addAttribute("member",m);
            return "/";
        }
        else
        {
            String message = "회원 정보 없습니다";
            model.addAttribute("message",message);
            return "/member/register";
        }
    }
}
