package com.company;

public abstract class wildAnimal extends Animal{
    protected boolean isPredator;

    wildAnimal(boolean predator){
        isPredator = predator;
    }

    @Override
    public void Voice(){
        super.Voice();
        System.out.print("I am a wild animal");
        if(isPredator)
            System.out.print(" and I am angry");
        System.out.println("");
    }
}
