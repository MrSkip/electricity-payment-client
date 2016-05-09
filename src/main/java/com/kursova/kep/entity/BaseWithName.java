package com.kursova.kep.entity;

/**
 * Created by Mr. Skip.
 */

public class BaseWithName extends BaseEntity {

    protected String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}