package com.company;

public class Hamster extends domesticAnimal {
    Hamster(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Hamster(int age, double weight, String color, boolean vaccinated, String catName){
        super(age, weight, color, vaccinated, catName);
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
