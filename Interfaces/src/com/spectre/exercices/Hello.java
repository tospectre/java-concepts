package com.spectre.exercices;

import com.spectre.exercices.phone.Iphone8;
import com.spectre.exercices.phone.OnePlus5;
import com.spectre.exercices.phone.Phone;

public class Hello {
    public static void main(String[] args) {
        Phone iphone = new Iphone8();
        Phone oneplus5 = new OnePlus5();

        System.out.println("Processor : " + iphone.Processor());
        System.out.println("Processor : " + oneplus5.Processor());
    }
}