package com.boot.test.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity(name = "user")
@Data
public class User {
    @Id
    private Long id;
    private String name;
    private String login;
    private String hashPassword;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Enumerated(value = EnumType.STRING)
    private Status status;
}
