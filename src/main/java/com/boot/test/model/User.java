package com.boot.test.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user")
@Data
public class User {
    @Id
    private Long id;
    private String name;
}
