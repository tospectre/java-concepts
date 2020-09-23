package com.spectre.exercices.phone;

public class OnePlus5 implements Phone {
    @Override
    public String Processor() {
        return "SnapDragon-385";
    }

    @Override
    public int Ram() {
        return 4;
    }

    @Override
    public int SpaceInGb() {
        return 32;
    }
}
