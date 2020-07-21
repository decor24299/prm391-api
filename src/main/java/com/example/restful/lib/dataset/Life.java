package com.example.restful.lib.dataset;

public class Life {

    private int id;

    private String name;

    private String description;

    private String filmingLocation;

    private String timeStart;

    private String timeEnd;

    private int numberOfFilming;

    public Life() {

    }

    public Life(int id, String name) {
        this.id = id;
        this.name = name;
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

}
