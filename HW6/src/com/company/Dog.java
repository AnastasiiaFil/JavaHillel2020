package com.company;

public class Dog extends  domesticAnimal {
    Dog(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Dog(int age, double weight, String color, String dogName, boolean vaccinated){
        super(age, weight, color, dogName, vaccinated);
    }

    @Override
    public void voice(){
        super.voice();
        System.out.println(". Woof-woof-woof!");
    }
}
