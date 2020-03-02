package com.company;

public class guideDog extends domesticAnimal{
    private boolean isTrained;

    guideDog(boolean vaccinated, boolean trained){
        super(vaccinated);
        isTrained = trained;
    }

    guideDog(boolean vaccinated, String gdName, boolean trained){
        super(vaccinated, gdName);
        isTrained = trained;
    }

    @Override
    public void Voice(){
        super.Voice();
//        if(name != null){
//            System.out.print("My name is " + name + ".");
//        }
        if(isTrained)
            System.out.print(" I can take you home.");
        System.out.println(" Woof-woof-woof!");
    }

    public void takeHome(){
        if(isTrained)
            System.out.println("I can take you home, follow me!");
        else
            System.out.println("Sorry, I am not trained...");
    }
}
