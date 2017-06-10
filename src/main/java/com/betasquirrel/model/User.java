package com.betasquirrel.model;

/**
 * Created by Anshad Vattapoyil on 10/06/17 2:57 PM.
 */
public class User {

    private long id;
    private String name;

    /**
     * Constructor
     *
     * @param id
     * @param name
     */
    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get id
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     * Set id
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
