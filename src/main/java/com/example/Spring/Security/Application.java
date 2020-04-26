package com.example.Spring.Security;

import com.example.Spring.Security.domain.User;
import com.example.Spring.Security.domain.UserRole;
import com.example.Spring.Security.repos.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
//        UserRepository userRepository = (UserRepository) run.getBean("userRepository");
//
//        User admin = new User("admin", "admin");
//
//        Set<UserRole> roles = new HashSet<>();
//        roles.add(UserRole.ROLE_ADMIN);
//        roles.add(UserRole.ROLE_USER);
//
//        admin.setRoles(roles);
//
//        userRepository.save(admin);

    }
}
