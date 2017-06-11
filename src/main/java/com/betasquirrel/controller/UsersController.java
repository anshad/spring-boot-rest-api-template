package com.betasquirrel.controller;

import com.betasquirrel.model.User;
import com.betasquirrel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Anshad Vattapoyil on 10/06/17 2:58 PM.
 */

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    /**
     * Get all users
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Create new user
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public List<User> saveUser(@RequestBody final User user) {
        userRepository.save(user);
        return userRepository.findAll();
    }

    /**
     * Get a specific user
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Integer userId) {
        return userRepository.findOne(userId);
    }

    /**
     * Delete a user
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public List<User> deleteUser(@PathVariable("id") Integer userId) {
        userRepository.delete(userId);
        return userRepository.findAll();
    }

}
