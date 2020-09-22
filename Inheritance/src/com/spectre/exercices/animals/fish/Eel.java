package com.spectre.udemyexercices.animals.fish;

public class Eel extends Fish {
    private String special;

    public Eel() {
        this.special = "Releases electric shock";
    }

    @Override
    public String showInfo() {
        return "Eel{" +
                "special='" + special + '\'' +
                ", livingArea='" + livingArea + '\'' +
                ", hasGills=" + hasGills +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
