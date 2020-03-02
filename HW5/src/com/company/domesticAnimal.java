package com.company;

public abstract class domesticAnimal extends Animal {
    protected String name;
    protected boolean isVaccinated;

    public void getName(){
        System.out.println("My Name is " + name);
    }
}
