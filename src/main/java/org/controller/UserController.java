package org.controller;


import org.pojo.User;
import org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user) {
        User queryUser = userService.queryByUser(user);
        if (user.getName().equals(queryUser.getName()) && user.getPwd().equals(queryUser.getPwd()))
            return "redirect:/paper/allPaper";
        else
            return "redirect:/";
    }
}
