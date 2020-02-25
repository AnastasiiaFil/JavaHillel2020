package com.company;

import java.util.Scanner;

public class ArrayTasks {

    void ninth(double[] array){
        double min = findMin(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] == min)
                System.out.println("min element: " + min + "(indx: " + i + ");");
        }

    }


    void tenth(double[] array){
        System.out.println("Max element: " + findMax(array));
    }


    void eleventh(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt(); // getting array sie
        double array[] = new double[size];
        System.out.println("Enter numbers, separating them by spaces:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }
        double min = findMin(array);
        double max = findMax(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] == min) array[i] = max;
            else if(array[i] == max) array[i] = min;
        }
        for(double i : array){
            System.out.print(i + " ");
        }

    }


    void twelfth(){
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter numbers amount: ");
        int size = input2.nextInt(); // getting array sie
        double array[] = new double[size];
        System.out.println("Enter numbers, separating them by spaces:");
        // Filling created array
        for (int i = 0; i < size; i++) {
            array[i] = input2.nextDouble(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.printf("Average of %d numbers: %.3f \n", size, nNumAverage(array));

    }


    void thirteenth(){
        char[][] chess = new char[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i + j) % 2 == 0) chess[i][j] = 'W';
                else chess[i][j] = 'B';
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }


    double findMin(double[] array){
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    double findMax(double[] array){
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    double nNumAverage(double[] arr){
        double sum = 0;
        for (double i:arr) {
            sum += i;
        }
        return sum / arr.length;
    }
}
