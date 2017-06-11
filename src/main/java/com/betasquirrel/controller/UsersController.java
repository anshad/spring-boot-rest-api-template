package com.betasquirrel.controller;

import com.betasquirrel.model.User;
import com.betasquirrel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Anshad Vattapoyil on 10/06/17 2:58 PM.
 */

@RestController
@RequestMapping("/v1/users")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<User> saveUser(@RequestBody final User user) {
        userRepository.save(user);
        return userRepository.findAll();
    }

}
