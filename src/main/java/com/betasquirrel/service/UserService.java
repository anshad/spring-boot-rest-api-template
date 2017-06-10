package com.betasquirrel.service;

import com.betasquirrel.model.User;

import java.util.List;

/**
 * Created by Anshad Vattapoyil on 10/06/17 2:58 PM.
 */
public interface UserService {

    User findById(long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    boolean isUserExists(User user);

}
