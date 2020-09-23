package com.spectre.exercices.animals.fish;

import com.spectre.exercices.animals.Animal;

public class Fish extends Animal {
    protected String livingArea;
    protected boolean hasGills;

    public Fish() {
        this.animalType = "fish";
        this.livingArea = "Live in water";
        this.hasGills = true;
    }

    public String getLivingArea() {
        return livingArea;
    }

    public boolean isHasGills() {
        return hasGills;
    }

    public String showInfo() {
        return "Fish{" +
                "livingArea='" + livingArea + '\'' +
                ", hasGills=" + hasGills +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
