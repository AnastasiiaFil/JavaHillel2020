package com.company;

public class Dog extends  domesticAnimal {
    Dog(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Dog(int age, double weight, String color, boolean vaccinated, String catName){
        super(age, weight, color, vaccinated, catName);
    }

    @Override
    public void Voice(){
        super.Voice();
        System.out.println("Woof-woof-woof!");
    }
}
