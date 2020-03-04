package com.company;

public abstract class WildAnimal extends Animal implements Predator{
    private boolean predator;

    WildAnimal(int age, double weight, String color, boolean predator){
        super(age, weight, color);
        this.predator = predator;
    }

    public boolean isPredator(){
        return this.predator;
    }

    @Override
    public void voice(){
        super.voice();
        System.out.print(" I am a wild animal");
        if(this.isPredator())
            System.out.print(" and I am angry");
        System.out.println("");
    }

    @Override
    public String toString(){
        return super.toString() + "; isPredator = " + this.isPredator();
    }
}
