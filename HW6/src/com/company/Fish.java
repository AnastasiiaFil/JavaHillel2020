package com.company;

public class Fish extends domesticAnimal {
    Fish(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Fish(int age, double weight, String color, String fishName, boolean vaccinated){
        super(age, weight, color, fishName, vaccinated);
    }

    @Override
    public void voice(){
        System.out.println(" ...!");
    }
}
