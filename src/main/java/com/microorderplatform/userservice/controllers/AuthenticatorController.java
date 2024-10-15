package com.microorderplatform.userservice.controllers;


import com.microorderplatform.userservice.dtos.user.AuthenticationDTO;
import com.microorderplatform.userservice.dtos.user.CreateUserDTO;
import com.microorderplatform.userservice.dtos.user.CreateUserResponse;
import com.microorderplatform.userservice.models.UserModel;
import com.microorderplatform.userservice.services.UserService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Beans;

@RestController
@RequestMapping("auth")
public class AuthenticatorController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO authenticationDTO) {
        var login = new UsernamePasswordAuthenticationToken(authenticationDTO.email(), authenticationDTO.password());
        var auth = this.authenticationManager.authenticate(login);
        return ResponseEntity.ok(auth);
    }

    @PostMapping("/register")
    public ResponseEntity<CreateUserResponse> register(@RequestBody @Valid CreateUserDTO createUserDTO) {
        if(userService.getUserByEmail(createUserDTO.email()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(createUserDTO.password());

        var userModel = new UserModel(createUserDTO.name(), createUserDTO.email(), encryptedPassword, createUserDTO.role());
        var userSaved = userService.saveUser(userModel);
        var response = new CreateUserResponse();
        BeanUtils.copyProperties(userSaved, response);
        return ResponseEntity.status(201).body(response);
    }
}
