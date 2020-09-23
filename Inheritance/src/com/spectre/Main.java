package com.spectre;

import com.spectre.exercices.animals.Animal;
import com.spectre.exercices.animals.bird.Eagle;
import com.spectre.exercices.animals.fish.Eel;
import com.spectre.exercices.animals.reptile.Crocodile;
import com.spectre.exercices.animals.reptile.Reptile;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.showInfo());
        Reptile reptile = new Reptile();
        Crocodile crocodile = new Crocodile();

        System.out.println(reptile.showInfo());
        System.out.println(crocodile.showInfo());
        Eel eel = new Eel();
        System.out.println(eel.showInfo());
        Eagle eagle = new Eagle();
        System.out.println();
    }

}
