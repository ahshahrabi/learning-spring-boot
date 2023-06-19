package com.amirhossein.learningspringboot.model;

import java.util.UUID;

public class User {
    private final UUID userUid;

    public UUID getUserUid() {
        return userUid;
    }

    public String getFirstName() {
        return firstName;
    }

    private final String firstName;



}
