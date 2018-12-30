package com.pk.common.LoginApplication.LoginRepository;

import com.pk.common.LoginApplication.model.Role;
import com.pk.common.LoginApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginRepository extends JpaRepository<User,Long> {
    List<User> findAll();
    User findByEmail(String email);
    User createUser(String name, String lastName, String userName, String email, String pass, Role role);
}
