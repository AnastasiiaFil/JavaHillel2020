package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat(10, 3, "White", true));
        animals.add(new Cat(5, 4, "Gray", "Jin", true));
        animals.add(new Dog(15, 3.5, "Black", true));
        animals.add(new Fish(1, 1, "Gold", false));
        animals.add(new Hamster(1, 0.3, "Brown", true));
        animals.add(new Wolf(5,20,"Gray", true));
        animals.add(new Lion(3,25,"Yellow",true));
        animals.add(new Giraffe(1, 100, "Mixed",false));
        animals.add(new Crocodile(2,120,"Green",true));
        guideDog gd = new guideDog(1,4,"Red","Bloo",true,false);
        animals.add(gd);

        for(Animal i : animals){
            i.voice();
        }

        gd.takeHome();

        System.out.println("________________________________________________\n");

        for(Animal i : animals){
            System.out.println(i.toString());
        }
    }
}
