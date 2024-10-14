package com.microorderplatform.userservice.controllers;


import com.microorderplatform.userservice.dtos.user.CreateUserDTO;
import com.microorderplatform.userservice.enums.UserRole;
import com.microorderplatform.userservice.models.UserModel;
import com.microorderplatform.userservice.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public ResponseEntity<UserModel> createUser(@RequestBody @Valid CreateUserDTO createUserDTO) {
//        try {
//            var userModel = new UserModel();
//            BeanUtils.copyProperties(createUserDTO, userModel);
//            try {
//                switch (createUserDTO.role()) {
//                    case "ADMIN" -> userModel.setRole(UserRole.ADMIN);
//                    case "USER" -> userModel.setRole(UserRole.USER);
//                }
//            } catch (Exception e) {
//                return ResponseEntity.badRequest().build();
//            }
//
//            return ResponseEntity.ok(userService.saveUser(userModel));
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().build();
//        }
    return null;
    }

}
