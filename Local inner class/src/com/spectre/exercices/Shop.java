package com.spectre.exercices;

import com.spectre.exercices.shop.Door;

public class Shop {
    public static void main(String[] args) {
        Door door = new Door();
//        System.out.println(door.isLocked("azerty"));
        if (door.isLocked(args[0])) {
            System.out.println("Shop is closed, please visit later !");
        } else
            System.out.println("Welcome to the shop !");
    }
}
