package com.company;

public class Fish extends domesticAnimal {
    Fish(int age, double weight, String color, boolean vaccinated){
        super(age, weight, color, vaccinated);
    }

    Fish(int age, double weight, String color, boolean vaccinated, String catName){
        super(age, weight, color, vaccinated, catName);
    }

    @Override
    public void Voice(){
//        super.Voice();
        System.out.println(" ...!");
    }
}
