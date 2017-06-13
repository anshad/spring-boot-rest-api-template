package com.betasquirrel.controller;

import com.betasquirrel.model.ObjectResponse;
import com.betasquirrel.model.ListResponse;
import com.betasquirrel.model.User;
import com.betasquirrel.repository.UserRepository;
import com.betasquirrel.util.ValidationError;
import com.betasquirrel.util.ValidationErrorBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Anshad Vattapoyil on 10/06/17 2:58 PM.
 */

@RestController
@EnableAutoConfiguration
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
    public ListResponse getAllUsers(HttpServletResponse http) {
        ListResponse response = new ListResponse();
        response.setMessage("Successfully Retrieved");
        response.setStatusCode(http.getStatus());
        List<User> users = userRepository.findAll();
        response.setData(users);
        return response;
    }

    /**
     * Create new user
     *
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ListResponse saveUser(@Valid @RequestBody final User user, HttpServletResponse http) {
        userRepository.save(user);
        ListResponse response = new ListResponse();
        response.setMessage("Successfully Created");
        response.setStatusCode(http.getStatus());
        List<User> users = userRepository.findAll();
        response.setData(users);
        return response;
    }

    /**
     * Get a specific user
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ObjectResponse getUser(@PathVariable("id") Integer userId, HttpServletResponse http) {
        ObjectResponse response = new ObjectResponse();
        response.setMessage("Successfully Retrieved");
        response.setStatusCode(http.getStatus());
        User user = userRepository.findOne(userId);
        response.setData(user);
        return response;
    }

    /**
     * Find and update a user
     *
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ObjectResponse updateUser(@RequestBody final User user, HttpServletResponse http) {
        if (userRepository.exists(user.getId())) {
            userRepository.updateUser(user.getName(), user.getEmail(), user.getMobile(), user.getId());
            ObjectResponse response = new ObjectResponse();
            response.setMessage("Successfully Updated");
            response.setStatusCode(http.getStatus());
            response.setData(userRepository.findOne(user.getId()));
            return response;
        }
        return null;
    }

    /**
     * Delete a user
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ListResponse deleteUser(@PathVariable("id") Integer userId, HttpServletResponse http) {
        userRepository.delete(userId);
        ListResponse response = new ListResponse();
        response.setMessage("Successfully Deleted");
        response.setStatusCode(http.getStatus());
        List<User> users = userRepository.findAll();
        response.setData(users);
        return response;
    }

    @ExceptionHandler
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ValidationError handleException(MethodArgumentNotValidException exception) {
        return createValidationError(exception);
    }

    private ValidationError createValidationError(MethodArgumentNotValidException e) {
        return ValidationErrorBuilder.fromBindingErrors(e.getBindingResult());
    }
}
