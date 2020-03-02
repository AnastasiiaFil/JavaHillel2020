package com.company;

public abstract class domesticAnimal extends Animal {
    protected String name;
    protected boolean isVaccinated;

    domesticAnimal(boolean vaccinated){
        isVaccinated = vaccinated;
    }

    domesticAnimal(boolean vaccinated, String animalName){
        isVaccinated = vaccinated;
        name = animalName;
    }

    public void getName(){
        System.out.println("My Name is " + name);
    }

    @Override
    public void Voice(){
        super.Voice();
        if(name != null){
            System.out.print("My name is " + name);
        }
    }
}
