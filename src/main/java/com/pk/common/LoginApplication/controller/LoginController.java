package com.pk.common.LoginApplication.controller;

import com.pk.common.LoginApplication.model.Role;
import com.pk.common.LoginApplication.model.User;
import com.pk.common.LoginApplication.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.synth.SynthGraphicsUtils;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @GetMapping("/all")
    public User getAll(){
        return loginService.getUserName("pardeepc4u@gmail.com");
    }

    @PostMapping("/login")
    public User getLogin(String email, String pass){
        return loginService.getUserName(email);
    }

    @PostMapping("/register")
    public User register(String name, String lastName, String userName, String email, String pass, Role role){
        User user = null;
        if(loginService != null){
            user = loginService.createUser(name, lastName, userName, email, pass, role);
        }
        return user;
    }
}
