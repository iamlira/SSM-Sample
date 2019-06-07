package org.controller;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.pojo.User;
import org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Aspect
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(User user) {
        ModelAndView mv=new ModelAndView();
        User queryUser = userService.queryByUser(user);
        login_aop();
        if (user.getName().equals(queryUser.getName()) && user.getPwd().equals(queryUser.getPwd()))
            mv.setViewName("redirect:/paper/allPaper");
        else {
            mv.addObject("errorMsg","登陆错误");
            mv.setViewName("redirect:/");
        }
        return mv;
    }

    @Pointcut("execution(public * org.controller.*.*(..))")
    public void login_aop(){

    }

    @Before("login_aop()")
    public void login_log(){
        System.out.println("before login");
    }
}
