package com.spectre.courses;

import com.spectre.courses.laptop.Laptop;
import com.spectre.courses.laptop.components.GraphicsCard;
import com.spectre.courses.laptop.components.Processor;
import com.spectre.courses.polymorphisme.SamsungNote8;
import com.spectre.courses.polymorphisme.Polymorphisme;

public class Hello {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        System.out.println(laptop.getProcessor().getBrand());
        Processor processor = new Processor("intel", "7200u", 7, 4, 4, "6MB", "2.5Ghz", "2.5Ghz", "3.4Ghz");
        GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 3090, "12GB");
        Laptop gamingLaptop = new Laptop(17.5f, processor, graphicsCard, "DDR4", "1TB", null, "backlit");

        System.out.println(gamingLaptop.toString());
        gamingLaptop.gamingMod();
        System.out.println("Gaming Mode On");
        System.out.println(gamingLaptop.getProcessor().getFrequency());
/*
        Polymorphisme polymorphisme = new Polymorphisme("Nokia 3310");
        System.out.println(polymorphisme.getModel());
        polymorphisme.features();*/

        SamsungNote8 samsungNote8 = new SamsungNote8("Note 8");
        System.out.println(samsungNote8.getModel());
        samsungNote8.features();

        Polymorphisme note8 = new SamsungNote8("Note 8");
        System.out.println(note8.getModel());
    }
}
