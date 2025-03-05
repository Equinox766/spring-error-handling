package org.equinox.errorhandling.controllers;

import org.equinox.errorhandling.exceptions.UserNotFoundException;
import org.equinox.errorhandling.models.domain.User;
import org.equinox.errorhandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    public UserService userService;

    @GetMapping
    public String index() {
       int value = Integer.parseInt("1d");
        System.out.println(value);
        return "Hello World";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable Long id) {
        User user = userService.findById(id).orElseThrow(() -> new  UserNotFoundException("There is no user with id " + id));
        System.out.println(user.getLastName());
        return user;
    }
}
