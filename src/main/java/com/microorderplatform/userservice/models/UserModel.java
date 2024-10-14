package com.microorderplatform.userservice.models;


import com.microorderplatform.userservice.enums.UserRole;
import com.microorderplatform.userservice.utils.user.BaseModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_USER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel extends BaseModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private UserRole role;

    @Column(nullable = false)
    private String status;

}
