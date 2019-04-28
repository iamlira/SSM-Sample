package org.controller;


import org.pojo.User;
import org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(User user) {
        ModelAndView mv=new ModelAndView();
        User queryUser = userService.queryByUser(user);
        if (user.getName().equals(queryUser.getName()) && user.getPwd().equals(queryUser.getPwd()))
            mv.setViewName("redirect:/paper/allPaper");
        else {
            mv.addObject("errorMsg","登陆错误");
            mv.setViewName("redirect:/");
        }
        return mv;
    }
}
