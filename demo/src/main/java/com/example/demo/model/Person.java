package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class Person {
    // creating the variables id and name
    private final UUID id;
    @NonNull
    private final String name;


    // constructor
    //JsonProperty for Postman, to parse the code into something legible for it
    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    // getters, to retrieve info
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
