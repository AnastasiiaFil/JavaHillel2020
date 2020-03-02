package com.company;

public class Hamster extends domesticAnimal {
    Hamster(boolean vaccinated){
        super(vaccinated);
    }

    Hamster(boolean vaccinated, String hamsterName){
        super(vaccinated, hamsterName);
    }

    @Override
    public void Voice(){
        super.Voice();
        if(name != null){
            System.out.print("My name is " + name);
        }
        System.out.println(" Squeak-squeak-squeak!");
    }
}
