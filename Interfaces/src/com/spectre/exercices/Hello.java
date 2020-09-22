package com.spectre.udemyexercices;

import com.spectre.udemyexercices.phone.Iphone8;
import com.spectre.udemyexercices.phone.OnePlus5;
import com.spectre.udemyexercices.phone.Phone;

public class Hello {
    public static void main(String[] args) {
        Phone iphone = new Iphone8();
        Phone oneplus5 = new OnePlus5();

        System.out.println("Processor : " + iphone.Processor());
        System.out.println("Processor : " + oneplus5.Processor());
    }
}
