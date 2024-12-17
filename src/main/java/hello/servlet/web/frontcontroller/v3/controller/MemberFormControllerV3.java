package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.web.frontcontroller.ModelAndView;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelAndView process(Map<String, String> paramModel) {
        return new ModelAndView("new-form");
    }
}
