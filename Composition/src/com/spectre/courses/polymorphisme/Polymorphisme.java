package com.spectre.courses.polymorphisme;

public class Polymorphisme {
    private String model;

    public Polymorphisme(String model) {
        this.model = model;
    }

    public void features() {
        System.out.println("Feature phone");
    }

    public String getModel() {
        return model;
    }
}
