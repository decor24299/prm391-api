package com.example.restful.lib.dataset;

public class Tool {

    private int id;

    private String name;

    private String description;

    private int quantity;

    private int statusId;

    public Tool() {

    }

    public Tool(String name, String description, int quantity, int statusId) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.statusId = statusId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
