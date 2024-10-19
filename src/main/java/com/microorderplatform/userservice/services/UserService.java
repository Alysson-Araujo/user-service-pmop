package com.microorderplatform.userservice.services;

import com.microorderplatform.userservice.models.UserModel;
import com.microorderplatform.userservice.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel saveUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public UserDetails getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
