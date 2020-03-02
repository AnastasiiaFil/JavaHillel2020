package com.company;

public class Cat extends domesticAnimal {

    Cat(boolean vaccinated){
        isVaccinated = vaccinated;
    }

    Cat(boolean vaccinated, String catName){
        isVaccinated = vaccinated;
        name = catName;
    }

    @Override
    public void Voice(){
        super.Voice();
        if(name != null){
            System.out.print("My name is " + name);
        }
        System.out.println(" Meow-meow-meow!");
    }
}
