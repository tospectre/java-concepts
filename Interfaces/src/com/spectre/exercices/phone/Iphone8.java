package com.spectre.exercices.phone;

public class Iphone8 implements Phone {
    @Override
    public String Processor() {
        return "A11";
    }

    @Override
    public int Ram() {
        return 3;
    }

    @Override
    public int SpaceInGb() {
        return 64;
    }
}
