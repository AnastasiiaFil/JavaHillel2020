package com.company;

public class Dog extends  DomesticAnimal {
    Dog(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Dog(int age, double weight, String color, boolean vaccinated, String dogName){
        super(age, weight, color, vaccinated, dogName);
    }

    @Override
    public void voice(){
        super.voice();
        System.out.println("Woof-woof-woof!");
    }
}
