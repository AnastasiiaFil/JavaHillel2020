package com.company;

public class Fish extends domesticAnimal {
    Fish(boolean vaccinated){
        super(vaccinated);
    }

    Fish(boolean vaccinated, String fishName){
        super(vaccinated, fishName);
    }

    @Override
    public void Voice(){
//        super.Voice();
        System.out.println(" ...!");
    }
}
