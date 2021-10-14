package com.company;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Tabby");
        //cat.setName("Salem");

        cat.breathe();
        cat.eat("fish");
        cat.poop();
        System.out.println(cat.getBreed());
        System.out.println(cat.getColor());
        System.out.println(cat.getName());

    }
}
