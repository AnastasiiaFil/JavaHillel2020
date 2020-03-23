package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        NoDuplicates withoutDuplicates = new NoDuplicates();
        ArrayList<String> str_list = new ArrayList<String>();
        str_list.add("Solnyshko");
        str_list.add("Jin");
        str_list.add("Solnyshko");
        str_list.add("Solnyshko");
        str_list.add("Zyaka");
        str_list.add("Zyaka");
        str_list.add("Bububu");
        str_list.add("Solnyshko");
        str_list.add("Jin");
        str_list.add("Solnyshko");
        str_list.add("Lalala");

        System.out.println("Result fot first exercise: ");
        for(String i: withoutDuplicates.deleteDuplicates(str_list)){
            System.out.print(i + " ");
        }



        SolvingQuadraticEquation equationNumbers = new SolvingQuadraticEquation(1.4, 5, 2.6);
        int i = 1;
        System.out.print("\n\nResult of solving quadratic equation (second ex.): ");
        for(double x : equationNumbers.solve()){
            System.out.print("X" + i + "= " + x + ";  ");
            i++;
        }



        System.out.println("\n\nResult fot third exercise: ");

        ArrayIterator iter = new ArrayIterator(7);

        int[] array = new int[]{1, 3, 5, 7 , 9, 11, 1};

        iter.setArray(array);
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }
}
