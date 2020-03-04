package com.company;

public class GuideDog extends DomesticAnimal implements Trained{
    private boolean trained;

    GuideDog(int age, double weight, String color, boolean vaccinated, boolean trained){
        super(age, weight, color, vaccinated);
        this.trained = trained;
    }

    GuideDog(int age, double weight, String color, String gdName, boolean vaccinated, boolean trained){
        super(age, weight, color, gdName, vaccinated);
        this.trained = trained;
    }

    public boolean isTrained(){
        return this.trained;
    }

    public void takeHome(){
        if(this.isTrained())
            System.out.println("I can take you home, follow me!");
        else
            System.out.println("Sorry, I am not trained...");
    }

    @Override
    public void voice(){
        super.voice();
        if(this.isTrained())
            System.out.print(" I'm trained.");
        System.out.println(" Woof-woof-woof!");
    }

    @Override
    public String toString(){
        return super.toString() + "; isTrained = " + this.isTrained();
    }
}
