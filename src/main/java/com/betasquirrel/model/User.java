package com.betasquirrel.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

/**
 * Created by Anshad Vattapoyil on 10/06/17 2:57 PM.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    @Email(message = "Invalid email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
