package com.company;

public class Hamster extends domesticAnimal {
    Hamster(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Hamster(int age, double weight, String color, String hamsterName, boolean vaccinated){
        super(age, weight, color, hamsterName, vaccinated);
    }

    @Override
    public void voice(){
        super.voice();
        System.out.println(". Squeak-squeak-squeak!");
    }
}
