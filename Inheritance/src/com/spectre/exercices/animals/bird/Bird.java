package com.spectre.exercices.animals.bird;

import com.spectre.exercices.animals.Animal;

public class Bird extends Animal {
    protected boolean feather = true;
    protected boolean canFly = true;

    public Bird() {
        this.feather = true;
        this.canFly = true;
    }

    public String showInfo() {
        return "Bird{" +
                "feather=" + feather +
                ", canFly=" + canFly +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
