package com.betasquirrel.service;

import com.betasquirrel.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Anshad Vattapoyil on 10/06/17 2:59 PM.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final AtomicLong counter = new AtomicLong();
    private static List<User> users;

    static {
        users = populateDummyData();
    }

    /**
     * Populate dummy list
     *
     * @return
     */
    private static List<User> populateDummyData() {
        List<User> users = new ArrayList<>();

        users.add(new User(counter.incrementAndGet(), "Anshad Vattapoyil"));
        users.add(new User(counter.incrementAndGet(), "Riyas Palackal"));

        return users;
    }

    @Override
    public User findById(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void saveUser(User user) {
        user.setId(counter.incrementAndGet());
        users.add(user);
    }

    @Override
    public void updateUser(User user) {
        int index = users.indexOf(user);
        users.set(index, user);
    }

    @Override
    public void deleteUserById(long id) {

    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public void deleteAllUsers() {
        users.clear();
    }

    @Override
    public boolean isUserExists(User user) {
        return false;
    }
}
