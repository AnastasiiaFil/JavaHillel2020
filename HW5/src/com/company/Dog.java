package com.company;

public class Dog extends  domesticAnimal {
    Dog(boolean vaccinated){
        isVaccinated = vaccinated;
    }

    Dog(boolean vaccinated, String dogName){
        isVaccinated = vaccinated;
        name = dogName;
    }

    @Override
    public void Voice(){
        super.Voice();
        if(name != null){
            System.out.print("My name is " + name);
        }
        System.out.println("Woof-woof-woof!");
    }
}
