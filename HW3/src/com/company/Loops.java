package com.company;

import java.util.Scanner;

public class Loops {
    void first(){
        for (int i = 1; i < 100; i += 2){
            System.out.print(i + " ");
        }
    }


    void second(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int n_factorial = 1;

        for(int i = 2; i <= n; i++){
            n_factorial *= i;
        }
        System.out.printf("Factorial of %d : %d", n, n_factorial);
    }


    void third_1(){
        int i = 1;
        while (i < 100){
            System.out.print(i + " ");
            i += 2;
        }
    }

    void third_2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int n_factorial = 1, i = 1;

        while(i <= n){
            n_factorial *= i++;
        }

        System.out.printf("Factorial of %d : %d", n, n_factorial);
    }


    void fourth_1(){
        int i = 1;
        do{
            System.out.print(i + " ");
            i += 2;
        } while (i < 100);
    }

    void fourth_2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int n_factorial = 1, i = 1;

        do{
            n_factorial *= i++;
        } while(i <= n);


        System.out.printf("Factorial of %d : %d", n, n_factorial);
    }

}
