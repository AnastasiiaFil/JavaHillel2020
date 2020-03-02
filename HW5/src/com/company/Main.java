package com.company;

public class Main {

    public static void main(String[] args) {

        Cat c1 = new Cat(true);
        Cat c2 = new Cat(true,"Jin");
        Dog d = new Dog(false);
        Fish f = new Fish(false);
        Hamster h = new Hamster(true);
        Wolf w = new Wolf(true);
        Lion l = new Lion(true);
        Giraffe g = new Giraffe(false);
        Crocodile croc =  new Crocodile(true);
        guideDog gd = new guideDog(true,"Jeck", true);

        c1.Voice();
        c2.Voice();
        d.Voice();
        f.Voice();
        h.Voice();
        l.Voice();
        w.Voice();
        g.Voice();
        croc.Voice();
        gd.Voice();
        gd.takeHome();







    }
}
