package com.company;

public class Hamster extends DomesticAnimal {
    Hamster(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Hamster(int age, double weight, String color, boolean vaccinated, String hamsterName){
        super(age, weight, color, vaccinated, hamsterName);
    }

    @Override
    public void voice(){
        super.voice();
        System.out.println(" Squeak-squeak-squeak!");
    }
}
