package fc.study.controller;
/**
 * 非注解实现
 */

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
/*        ModelAndView mv = new ModelAndView();
        //封装显示到试图的数据名称
        mv.addObject("message","helloMVC");
        //视图名
        mv.setViewName("hello");
        return mv;*/
        ModelAndView mav = new ModelAndView("WEB-INF/jsp/index.jsp");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
}
