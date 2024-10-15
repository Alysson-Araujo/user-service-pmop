package com.microorderplatform.userservice.dtos.user;

import com.microorderplatform.userservice.enums.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserResponse {
    private UUID id;
    private String name;
    private String email;
    private UserRole role;
}
