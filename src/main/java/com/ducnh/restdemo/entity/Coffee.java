package com.ducnh.restdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;
@Entity
public class Coffee {
    @Id
    private String id;
    private String name;

    public Coffee() {

    }
    public Coffee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

