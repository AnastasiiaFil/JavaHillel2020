package com.company;

public class Hamster extends domesticAnimal {
    Hamster(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Hamster(int age, double weight, String color, boolean vaccinated, String hamsterName){
        super(age, weight, color, vaccinated, hamsterName);
    }

    @Override
    public void Voice(){
        super.Voice();
        System.out.println(" Squeak-squeak-squeak!");
    }
}
