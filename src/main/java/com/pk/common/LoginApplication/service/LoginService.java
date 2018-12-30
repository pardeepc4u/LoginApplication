package com.pk.common.LoginApplication.service;

import com.pk.common.LoginApplication.LoginRepository.LoginRepository;
import com.pk.common.LoginApplication.model.Role;
import com.pk.common.LoginApplication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public User getUserName(String email){
        return loginRepository.findByEmail(email);
    }

    public User createUser(String name, String lastName, String userName, String email, String pass, Role role){
        return loginRepository.createUser(name, lastName, userName, email, pass, role);
    }

    public User register(String name, String lastName, String userName, String email, String pass, Role role){
        return loginRepository.createUser(name, lastName, userName, email, pass, role);
    }
}
