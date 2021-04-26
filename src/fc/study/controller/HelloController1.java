package fc.study.controller;
/**
 * 注解实现
 */
import fc.study.pojo.User;
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

    //接收数据
    //实现方法1，使用 Servlet 原生的 API
/*    @RequestMapping("/param")
    public ModelAndView getParam(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        System.out.println(userName);
        System.out.println(password);
        return null;
    }*/

    //实现方法2，使用注解或者同名匹配
/*    @RequestMapping("/param")
    public ModelAndView getParam(@RequestParam("userName_1") String userName, String password) {

        System.out.println(userName);
        System.out.println(password);
        return null;
    }*/

    //实现方法3，使用java简单类模型传参
    @RequestMapping("/param")
    public ModelAndView getParam(User user) {

        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        return null;
    }


}
