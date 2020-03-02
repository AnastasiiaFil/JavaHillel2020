package com.company;

public class Main {

    public static void main(String[] args) {

        Cat c1 = new Cat(10, 3, "White", true);
        Cat c2 = new Cat(5, 4, "Gray", true,"Jin");
        Dog d = new Dog(15, 3.5, "Black", true);
        Fish f = new Fish(1, 1, "Gold", false);
        Hamster h = new Hamster(1, 0.3, "Brown", true);
        Wolf w = new Wolf(5,20,"Gray", true);
        Lion l = new Lion(3,25,"Yellow",true);
        Giraffe g = new Giraffe(1, 100, "Mixed",false);
        Crocodile croc =  new Crocodile(2,120,"Green",true);
        guideDog gd = new guideDog(5,15,"Brown","Lucky",true,true);

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

        System.out.println("________________________________________________\n");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(d.toString());
        System.out.println(f.toString());
        System.out.println(h.toString());
        System.out.println(l.toString());
        System.out.println(w.toString());
        System.out.println(g.toString());
        System.out.println(croc.toString());
        System.out.println(gd.toString());







    }
}
