package com.spectre.udemycourses.polymorphisme;

public class UdemyPolymorphisme {
    private String model;

    public UdemyPolymorphisme(String model) {
        this.model = model;
    }

    public void features() {
        System.out.println("Feature phone");
    }

    public String getModel() {
        return model;
    }
}
