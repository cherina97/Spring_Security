package com.example.Spring.Security.services;

import com.example.Spring.Security.domain.User;
import com.example.Spring.Security.domain.UserRole;
import com.example.Spring.Security.dtos.UserRegisterRequest;
import com.example.Spring.Security.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void save(UserRegisterRequest userRegisterRequest){
        User user = new User();

        user.setRoles(Collections.singleton(UserRole.ROLE_USER));
        user.setUsername(userRegisterRequest.getUsername());
        String password = userRegisterRequest.getPassword();
        user.setPassword(passwordEncoder.encode(password));

//        if(user.getUsername().equals("admin")){
//            user.setRoles(new HashSet<UserRole>(Arrays.asList(UserRole.ROLE_USER, UserRole.ROLE_ADMIN)));
//        }

        userRepository.save(user);
    }
}
