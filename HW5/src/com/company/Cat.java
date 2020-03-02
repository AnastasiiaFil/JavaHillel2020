package com.company;

public class Cat extends domesticAnimal {

    Cat(boolean vaccinated){
        super(vaccinated);
    }

    Cat(boolean vaccinated, String catName){
        super(vaccinated, catName);
    }

    @Override
    public void Voice(){
        super.Voice();
//        if(name != null){
//            System.out.print("My name is " + name);
//        }
        System.out.println(" Meow-meow-meow!");
    }
}
