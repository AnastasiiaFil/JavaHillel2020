package com.company;

public class Cat extends domesticAnimal {

    Cat(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Cat(int age, double weight, String color, boolean vaccinated, String catName){
        super(age, weight, color, vaccinated, catName);
    }

    @Override
    public void Voice(){
        super.Voice();
        System.out.println(" Meow-meow-meow!");
    }
}
