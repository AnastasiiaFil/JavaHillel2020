package com.company;

import java.util.Scanner;

public class AVGofN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers amount: ");
        int size = input.nextInt(); // getting array sie
        double array[] = new double[size];
        System.out.println("Enter numbers, separating them by spaces:");
        // Filling created array
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.printf("Average of %d entered numbers: %.3f \n", size, nNumAverage(array));
        input.close();
    }

    static double nNumAverage(double[] arr){
        double sum = 0;
        for (double i:arr) {
            sum += i;
        }
        return sum / arr.length;
    }
}
