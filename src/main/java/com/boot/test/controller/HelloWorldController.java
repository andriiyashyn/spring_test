package com.boot.test.controller;

import com.boot.test.model.User;
import com.boot.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController("/")
public class HelloWorldController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
    public List<Long> user(@PathVariable final String name) {
        return userRepository.findAllByName(name).stream().map(User::getId).collect(Collectors.toList());

    }

}
