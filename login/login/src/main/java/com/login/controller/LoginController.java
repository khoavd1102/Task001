package com.login.controller;

import com.login.config.AES;
import com.login.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/login")
    public ModelAndView loginPage(){
        ModelAndView modelAndView = new ModelAndView("loginPage");

        return modelAndView;
    }
//    public ModelAndView loginPage(){
//        ModelAndView modelAndView = new ModelAndView("loginPage");
//
//        return modelAndView;
//    }
    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home");

        return modelAndView;
    }
}
