package com.company;

public class Crocodile extends wildAnimal{
    Crocodile(boolean predator){
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
