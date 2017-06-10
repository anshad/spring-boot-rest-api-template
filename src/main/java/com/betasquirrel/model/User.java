package com.betasquirrel.model;

/**
 * Created by Anshad Vattapoyil on 10/06/17 2:57 PM.
 */
public class User {

    private long id;
    private String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
