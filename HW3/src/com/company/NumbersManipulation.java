package com.company;

import java.util.Scanner;

public class NumbersManipulation {
    void fifth(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        double power = 1;
        System.out.print("Enter n: ");
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            power *= x;
        }

        System.out.printf("%.5f to the %d power: %.5f", x, n, power);
    }


    void sixth(){
        int elements = 0;
        for(int i = 0; i < 10; i++){
            System.out.print(elements + " ");
            elements -= 5;
        }
    }


    void seventh(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = in.nextDouble();

        for(int i = 0; i < 10; i++){
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }


    void eighth(){
        int[] odd = new int[10];
        for(int i = 0; i < odd.length; i++){
            odd[i] = 2*i + 1;
        }

        for(int i : odd){
            System.out.print(i + ", ");
        }
    }
}
