package com.boot.test.service;

import com.boot.test.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll(String sort);

    List<Long> findIdsByName(String name);
}
