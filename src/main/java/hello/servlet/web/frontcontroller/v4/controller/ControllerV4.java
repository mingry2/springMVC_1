package hello.servlet.web.frontcontroller.v4.controller;

import java.util.Map;

public interface ControllerV4 {

    /**
     *
     * @param paramMap
     * @param model
     * @return viewName(String)
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
