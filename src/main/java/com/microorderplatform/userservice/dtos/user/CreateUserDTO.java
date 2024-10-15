package com.microorderplatform.userservice.dtos.user;

import com.microorderplatform.userservice.enums.UserRole;

public record CreateUserDTO (String name, String email, String password, UserRole role) {
}
