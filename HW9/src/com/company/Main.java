package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        NoDuplicates withoutDuplicates = new NoDuplicates();
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Dog");
        strList.add("Cat");
        strList.add("Dog");
        strList.add("Dog");
        strList.add("Fish");
        strList.add("Fish");
        strList.add("Pig");
        strList.add("Dog");
        strList.add("Cat");
        strList.add("Dog");
        strList.add("Mouse");

        System.out.println("Result fot first exercise (String list): ");
        for(String i: withoutDuplicates.deleteDuplicates(strList)){
            System.out.print(i + " ");
        }



        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(2);
        intList.add(1);
        intList.add(3);
        intList.add(0);
        intList.add(10);
        intList.add(1);
        intList.add(0);
        intList.add(1);
        intList.add(23);

        System.out.println("\n\nResult fot first exercise (Integer list): ");
        for(Integer i: withoutDuplicates.deleteDuplicates(intList)){
            System.out.print(i + " ");
        }

        SolvingQuadraticEquation equationNumbers = new SolvingQuadraticEquation(1.4, 5, 2.6);
        int i = 1;
        System.out.print("\n\nResult of solving quadratic equation (second ex.): ");
        for(double x : equationNumbers.solve()){
            System.out.print("X" + i + "= " + x + ";  ");
            i++;
        }



        System.out.println("\n\nResult fot third exercise (Integer array): ");

        ArrayIterator<Integer> intIter = new ArrayIterator(7);
        Integer[] intArray = new Integer[]{1, 3, 5, 7 , 9, 11, 1};

        intIter.setArray(intArray);
        while(intIter.hasNext()){
            System.out.print(intIter.next() + " ");
        }



        System.out.println("\n\nResult fot third exercise (String array): ");

        ArrayIterator<String> strIter = new ArrayIterator(7);
        String[] strArray = new String[]{"Cat", "Dog", "Fish", "Parrot" , "Snake", "Spider", "Hamster"};

        strIter.setArray(strArray);
        while(strIter.hasNext()){
            System.out.print(strIter.next() + " ");
        }
    }
}
