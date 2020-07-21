package com.example.restful.lib.dataset;

public class Actor {

    private int id;

    private String name;

    private String description;

    private String phone;

    private String email;

    public Actor() {

    }

    public Actor(String name, String description, String phone, String email) {
        this.name = name;
        this.description = description;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
