package com.company;

public abstract class DomesticAnimal extends Animal implements Vaccinated{
    private String name;
    private boolean vaccinated;

    DomesticAnimal(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color);
        this.vaccinated = vaccinated;
    }

    DomesticAnimal(int age, double weight, String color, String animalName, boolean vaccinated){
        super(age, weight, color);
        this.vaccinated = vaccinated;
        name = animalName;
    }

    public boolean isVaccinated(){
        return this.vaccinated;
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
            return super.toString() + "; Name = " + name + "; isVaccinated = " + this.isVaccinated();
        }
        return super.toString() + "; isVaccinated = " + this.isVaccinated();
    }
}
