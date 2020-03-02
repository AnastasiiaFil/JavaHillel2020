package com.company;

public class Fish extends domesticAnimal {
    Fish(boolean vaccinated){
        isVaccinated = vaccinated;
    }

    Fish(boolean vaccinated, String fishName){
        isVaccinated = vaccinated;
        name = fishName;
    }

    @Override
    public void Voice(){
        super.Voice();
        System.out.println(" ...!");
    }
}
