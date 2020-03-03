package com.company;

public abstract class domesticAnimal extends Animal {
    private String name;
    private boolean isVaccinated;

    domesticAnimal(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color);
        isVaccinated = vaccinated;
    }

    domesticAnimal(int age, double weight, String color, boolean vaccinated, String animalName){
        super(age, weight, color);
        isVaccinated = vaccinated;
        name = animalName;
    }

    @Override
    public void Voice(){
        super.Voice();
        if(name != null){
            System.out.print("my name is " + name);
        }
    }

    @Override
    public String toString(){
        if(name != null){
            return super.toString() + "; Name = " + name + "; isVaccinated = " + isVaccinated;
        }
        return super.toString() + "; isVaccinated = " + isVaccinated;
    }
}
