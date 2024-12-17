package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelAndView;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3{

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelAndView process(Map<String, String> paramModel) {
        List<Member> members = memberRepository.findAll();

        ModelAndView mv = new ModelAndView("members");
        mv.getModel().put("members", members);

        return mv;
    }
}
