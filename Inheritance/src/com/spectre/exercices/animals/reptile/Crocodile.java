package com.spectre.udemyexercices.animals.reptile;

public class Crocodile extends Reptile {
    public Crocodile() {
        super();
        this.eggs = "Hard-Shelled eggs";
    }

    public String showInfo() {
        return "Crocodile{" +
                "skin='" + skin + '\'' +
                ", backBone=" + backBone +
                ", eggs='" + eggs + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
