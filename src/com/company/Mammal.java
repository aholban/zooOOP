package com.company;

public abstract class Mammal extends Animal{

    //////////////////////////////////////Attributes////////////////////////////////



    /////////////////////////////////////Constructors//////////////////////////////////////

    public Mammal(String name){
        super(name);
    }

    ////////////////////////////////////Methods///////////////////////////////////////

    public Animal reproduce(Animal mother, Animal father){
        return null;
    }

    public void breathe(){
        System.out.println("Breathe through nose");
    }

}
