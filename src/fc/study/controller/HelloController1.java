package fc.study.controller;
/**
 * 注解实现
 */
import fc.study.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.management.modelmbean.ModelMBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class HelloController1 {

    @RequestMapping("/hello")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception{
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","hello xidian hh");
        httpServletResponse.getWriter().println("hello SpringMVC 你好");
        return modelAndView;
    }

    @RequestMapping("/print")
    public void getPrint(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
        //直接在页面输出
        //httpServletResponse.getWriter().println("hello SpringMVC");
        //进行重定向
        //httpServletResponse.sendRedirect("hello.jsp");
        //实现转发
        httpServletRequest.setAttribute("msg","servlet api");
        httpServletRequest.getRequestDispatcher("hello.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //没有视图解析器
    @RequestMapping("/print1")
    public String hello(){
        //转发实现1
        //return "hello.jsp";
        //转发实现2
        //return "forward:hello.jsp";
        //重定向
        return "redirect:hello.jsp";
    }

    //有视图解析器
    @RequestMapping("/print2")
    public String hello2(){
        //转发
       // return "hello";
        //重定向，不需要视图解析器
        return "redirect:hello.jsp";
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

    //跳转
    @RequestMapping("/jump")
    public ModelAndView junp(){
        ModelAndView mav = new ModelAndView("redirect:/test");
        // 或者直接写成： return "redirect: ./hello";
        return mav;
    }

    //传数据
    @RequestMapping("/data/{id}")
    //ModelMap用来传递数据，只能放在方法的参数里面
    public String data(@RequestParam("userName") String name,@PathVariable("id") int id, ModelMap modelMap){
        //相当于httpServletRequest.setAttribute("name",name);
        modelMap.addAttribute("name",name);
        modelMap.addAttribute("id",id);
        System.out.println(name);
        return "index";
    }


}
