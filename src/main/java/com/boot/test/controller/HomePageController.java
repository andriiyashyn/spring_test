package com.boot.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/")
public class HomePageController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(final Model model) {
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(final Model model) {
        return "login";
    }
}
