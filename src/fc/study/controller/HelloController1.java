package fc.study.controller;
/**
 * 注解实现
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class HelloController1 {

    @RequestMapping("/hello")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception{
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","hello xidian");
        return modelAndView;
    }

    @RequestMapping("/test")
    public ModelAndView handleRequest1(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception{
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping("/param")
    public ModelAndView getParam(@RequestParam("userName_1") String userName, String password) {

        System.out.println(userName);
        System.out.println(password);
        return null;
    }
}
