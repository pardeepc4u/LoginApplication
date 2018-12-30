package com.pk.common.LoginApplication;

import com.pk.common.LoginApplication.LoginRepository.LoginRepository;
import com.pk.common.LoginApplication.model.Role;
import com.pk.common.LoginApplication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class LoginApplication {

	@Autowired
	LoginRepository loginRepository;

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

//	@PostConstruct
//	public static void init(){
//		Role admin=new Role(1,"Admin");
//		User pardeep=new User(1,"Pardeep","Yadav","pardeepyadav","patrdeepc4u@gmail.com","password", admin);
//		User pk=new User(2,"PK","Yadav","pardeepyadav","patrdeepc4u@gmail.com","password",admin);
//	}
}
