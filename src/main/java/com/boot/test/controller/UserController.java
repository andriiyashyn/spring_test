package com.boot.test.controller;

import com.boot.test.model.User;
import com.boot.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String user(@PathVariable final String name, final Model model) {
        List<Long> idsByName = userService.findIdsByName(name);
        model.addAttribute("idsByName", idsByName);
        return "home";
    }

    @RequestMapping(value = "/all/{sort}", method = RequestMethod.GET)
    public String userSort(@PathVariable final String sort, final Model model) {
        List<User> users = userService.findAll(sort);
        model.addAttribute("users", users);
        return "users";
    }
}
