package com.company;

public abstract class wildAnimal extends Animal{
    protected boolean isPredator;

    wildAnimal(int age, double weight, String color, boolean predator){
        super(age, weight, color);
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

    @Override
    public String toString(){
        return super.toString() + "; isPredator = " + isPredator;
    }
}
