package com.company;

public class GuideDog extends DomesticAnimal{
    private boolean isTrained;

    GuideDog(int age, double weight, String color, boolean vaccinated, boolean trained){
        super(age, weight, color, vaccinated);
        isTrained = trained;
    }

    GuideDog(int age, double weight, String color, String gdName, boolean vaccinated, boolean trained){
        super(age, weight, color, vaccinated, gdName);
        isTrained = trained;
    }

    public void takeHome(){
        if(isTrained)
            System.out.println("I can take you home, follow me!");
        else
            System.out.println("Sorry, I am not trained...");
    }

    @Override
    public void voice(){
        super.voice();
        if(isTrained)
            System.out.print(" I'm trained.");
        System.out.println(" Woof-woof-woof!");
    }

    @Override
    public String toString(){
        return super.toString() + "; isTrained = " + isTrained;
    }
}
