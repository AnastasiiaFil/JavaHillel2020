package com.company;

public class Dog extends  domesticAnimal {
    Dog(boolean vaccinated){
        super(vaccinated);
    }

    Dog(boolean vaccinated, String dogName){
        super(vaccinated, dogName);
    }

    @Override
    public void Voice(){
        super.Voice();
        System.out.println("Woof-woof-woof!");
    }
}
