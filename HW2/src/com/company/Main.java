package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int menu;
        do {
            printMenu();
            Scanner in = new Scanner(System.in);
            System.out.print("Enter menu number: ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    Scanner input1 = new Scanner(System.in);
                    System.out.print("Input first number: ");
                    double a = input1.nextDouble();
                    System.out.print("Input second number: ");
                    double b = input1.nextDouble();
                    System.out.printf("Average of two numbers: %.3f \n", twoNumAverage(a, b));
                    break;
                case 2:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Enter numbers amount: ");
                    int size = input2.nextInt(); // getting array sie
                    double array[] = new double[size];
                    System.out.println("Enter numbers, separating them by spaces:");
                    // Filling created array
                    for (int i = 0; i < size; i++) {
                        array[i] = input2.nextDouble(); // Заполняем массив элементами, введёнными с клавиатуры
                    }
                    System.out.printf("Average of %d numbers: %.3f \n", size, nNumAverage(array));
                    break;
                case 3:
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Enter deposit value (in UAH): ");
                    double deposit = input3.nextDouble();
                    System.out.print("\nPer cent of annual: ");
                    double percent = input3.nextDouble();
                    System.out.print("\nTerm of the deposit: ");
                    double term = input3.nextDouble();
                    depositInfo(deposit, percent, term);
                    break;
                case 4:
                    System.out.println("Menu's closed!");
                    break;
                default:
                    System.out.println("Error: Undefined menu item!\n");
            }
        }
        while(menu != 4);
    }

    static void printMenu() {
        System.out.println("\nAverage of two numbers ---> 1");
        System.out.println("Average of arbitrary amount of numbers ---> 2");
        System.out.println("Bank info: Accumulated amount of money & Accured interest on the deposit ---> 3");
        System.out.println("Close menu ---> 4 \n");
    }

    static double twoNumAverage(double a, double b){
        return (a + b)/2;
    }

    static double nNumAverage(double[] arr){
        double sum = 0;
        for (double i:arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    static void depositInfo(double deposit, double percent, double term) {
        int years = (int) Math.ceil(term);
        double recieved_money[] = new double[years];
        double recieved_percent[] = new double[years];

        for (int i = 0; i < years; i++) {
            if (years != term) {
                recieved_percent[i] = deposit * percent * (years - term) / 100;
            }
            else recieved_percent[i] = deposit * percent / 100;
            recieved_money[i] = deposit + recieved_percent[i];
            deposit = recieved_money[i];
            System.out.printf("Info for %d year: accumulated money %.3f; recieved money from per cent: %.3f\n", i + 1, recieved_money[i], recieved_percent[i]);
        }
    }
}
