package com.company;

public class Fish extends domesticAnimal {
    Fish(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Fish(int age, double weight, String color, boolean vaccinated, String fishName){
        super(age, weight, color, vaccinated, fishName);
    }

    @Override
    public void Voice(){
        System.out.println(" ...!");
    }
}
