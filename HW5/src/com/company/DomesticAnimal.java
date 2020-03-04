package com.company;

public abstract class DomesticAnimal extends Animal {
    private String name;
    private boolean isVaccinated;

    DomesticAnimal(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color);
        isVaccinated = vaccinated;
    }

    DomesticAnimal(int age, double weight, String color, boolean vaccinated, String animalName){
        super(age, weight, color);
        isVaccinated = vaccinated;
        name = animalName;
    }

    @Override
    public void voice(){
        super.voice();
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
