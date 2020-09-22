package com.spectre.udemyexercices.animals.reptile;

import com.spectre.udemyexercices.animals.Animal;

public class Reptile extends Animal {
    protected String skin;
    protected boolean backBone;
    protected String eggs;

    public Reptile() {
        this.height = 5.5;
        this.weight =  150d;
        this.animalType = "Reptile";
        this.bloodType = "Cold";
        this.skin = "Dry Skin";
        this.backBone = true;
        this.eggs = "Soft-Shelled egg";
    }

    public String getSkin() {
        return skin;
    }

    public boolean isBackBone() {
        return backBone;
    }

    public String isSoftShelledEggs() {
        return eggs;
    }

    public String showInfo() {
        return "Reptile{" +
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
