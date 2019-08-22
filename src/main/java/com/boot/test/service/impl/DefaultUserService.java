package com.boot.test.service.impl;

import com.boot.test.model.User;
import com.boot.test.repository.UserRepository;
import com.boot.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DefaultUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll(final String sort) {
        List<User> users = new ArrayList<>();
        userRepository.findAll(new Sort(Sort.Direction.valueOf(sort.toUpperCase()), "id")).forEach(users::add);
        return users;
    }

    @Override
    public List<Long> findIdsByName(String name) {
        return userRepository.findAllByName(name).stream().map(User::getId).collect(Collectors.toList());
    }
}
