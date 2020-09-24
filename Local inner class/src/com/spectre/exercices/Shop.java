package com.spectre.exercices;

import com.spectre.exercices.shop.Door;

public class Shop {
    public static void main(String[] args) {
//        Door door = new Door();
//        System.out.println(door.isLocked("azerty"));

        if (/*This little update describe how to use an Anonymous object by instantiate a nameless new Door*/new Door().isLocked(args[0])) {
            System.out.println("Shop is closed, please visit later !");
        } else
            System.out.println("Welcome to the shop !");
    }
}
