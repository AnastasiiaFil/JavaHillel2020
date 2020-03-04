package com.company;

public class Fish extends DomesticAnimal {
    Fish(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Fish(int age, double weight, String color, boolean vaccinated, String fishName){
        super(age, weight, color, vaccinated, fishName);
    }

    @Override
    public void voice(){
        System.out.println(" ...!");
    }
}
