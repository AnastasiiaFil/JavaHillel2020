package com.company;

import java.util.Scanner;

public class AVGof2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        double a = input.nextDouble();
        System.out.print("Input second number: ");
        double b = input.nextDouble();
        System.out.printf("Average of two numbers: %.3f \n", twoNumAverage(a, b));
        input.close();
    }

    static double twoNumAverage(double a, double b){
        return (a + b)/2;
    }
}
