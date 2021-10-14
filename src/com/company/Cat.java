package com.company;

public class Cat extends Mammal{

    ///////////////////////////////////////////////Attributes////////////////////////////////////////

    private String breed;
    private int weight;
    private String sex;
    private String color;

    //////////////////////////////////////////////Constructors/////////////////////////////////////////

    public Cat(){
        this("Black");
    }

    public Cat(String color){
        this("Domestic Shorthair", color, "Cat");
    }

    public Cat(String breed, String color, String name){
        super(name);
        this.breed = breed;
        this.color = color;
    }

    //////////////////////////////////////////////Methods/////////////////////////////////////////////

    public void eat(String food){
        System.out.println("I am eating " + food);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
