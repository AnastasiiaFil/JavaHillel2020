package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int menu;
        do {
            printMenu();
            Scanner in = new Scanner(System.in);
            System.out.print("\n\nEnter menu number: ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    first();
                    break;
                case 2:
                    second();
                    break;
                case 3:
                    System.out.print("Would you like to find factorial? (yes/no): ");
                    String choice1 = in.next();
                    if(choice1.toLowerCase().equals("yes")) third_2();
                    else if(choice1.toLowerCase().equals("no")) third_1();
                    else System.out.println("Input Error: enter yes/no ");
                    break;
                case 4:
                    System.out.print("Would you like to find factorial? (yes/no): ");
                    String choice2 = in.next();
                    if(choice2.toLowerCase().equals("yes")) fourth_2();
                    else if(choice2.toLowerCase().equals("no")) fourth_1();
                    else System.out.println("Input Error: enter yes/no ");
                    break;
                case 5:
                    fifth();
                    break;
                case 6:
                    sixth();
                    break;
                case 7:
                    seventh();
                    break;
                case 8:
                    eighth();
                    break;
                case 9:
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter array size: ");
                    int size = input.nextInt(); // getting array sie
                    double[] array = new double[size];
                    System.out.println("Enter numbers, separating them by spaces:");
                    // Filling created array
                    for (int i = 0; i < size; i++) {
                        array[i] = input.nextDouble(); // Заполняем массив элементами, введёнными с клавиатуры
                    }

                    ninth(array);
                    System.out.print("Complete task 10? (yes/no): ");
                    String choice3 = in.next();
                    if(choice3.toLowerCase().equals("yes")) tenth(array);
                    break;
                case 10:
                    System.out.println("Task 9 should be done first.");
                    break;
                case 11:
                    eleventh();
                    break;
                case 12:
                    twelfth();
                    break;
                case 13:
                    thirteenth();
                    break;
                case 14:
                    System.out.println("Menu's closed!");
                    break;
                default:
                    System.out.println("Error: Undefined menu item!\n");

            }
            if(menu != 14){
                System.out.print("\n\nWould you like to continue? (yes/no): ");
                String choice = in.next();
                if(choice.toLowerCase().equals("no")) menu = 14;
            }
        } while(menu != 14 );
    }

    static void printMenu(){
        System.out.println("Menu options for third homework: ");
        System.out.println("\n1 Print odd numbers from 1 to 99 (loop for)");
        System.out.println("\n2  Find factorial (loop for)");
        System.out.println("\n3  Tasks 1&2 with loop while");
        System.out.println("\n4  Tasks 1&2 with loop do while");
        System.out.println("\n5  Raise x to the n power");
        System.out.println("\n6  Print the first 10 numbers of the sequence 0, -5, -10, -15...");
        System.out.println("\n7  Print the multiplication table for x");
        System.out.println("\n8  Print the elements of the created array (contains 10 first odd numbers) to the console in one line, separated them by a comma");
        System.out.println("\n9  Find the smallest element of the array and print it");
        System.out.println("\n10  In the array from task 9 find the largest element");
        System.out.println("\n11  Swap the largest and smallest elements in the array");
        System.out.println("\n12  Find the average of all elements of the array");
        System.out.println("\n13  Display 8x8 chessboard");
        System.out.println("\n14  Close menu");
    }


    static void first(){
        for (int i = 1; i < 100; i += 2){
            System.out.print(i + " ");
        }
    }


    static void second(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int n_factorial = 1;

        for(int i = 2; i <= n; i++){
            n_factorial *= i;
        }
        System.out.printf("Factorial of %d : %d", n, n_factorial);
    }


    static void third_1(){
        int i = 1;
        while (i < 100){
            System.out.print(i + " ");
            i += 2;
        }
    }

    static void third_2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int n_factorial = 1, i = 1;

        while(i <= n){
            n_factorial *= i++;
        }

        System.out.printf("Factorial of %d : %d", n, n_factorial);
    }


    static void fourth_1(){
        int i = 1;
        do{
            System.out.print(i + " ");
            i += 2;
        } while (i < 100);
    }

    static void fourth_2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int n_factorial = 1, i = 1;

        do{
            n_factorial *= i++;
        } while(i <= n);


        System.out.printf("Factorial of %d : %d", n, n_factorial);
    }


    static void fifth(){
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


    static void sixth(){
        int elements = 0;
        for(int i = 0; i < 10; i++){
            System.out.print(elements + " ");
            elements -= 5;
        }
    }


    static void seventh(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = in.nextDouble();

        for(int i = 0; i < 10; i++){
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }


    static void eighth(){
        int[] odd = new int[10];
        for(int i = 0; i < odd.length; i++){
            odd[i] = 2*i + 1;
        }

        for(int i : odd){
            System.out.print(i + ", ");
        }
    }


    static void ninth(double[] array){
        double min = findMin(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] == min)
                System.out.println("min element: " + min + "(indx: " + i + ");");
        }

    }


    static void tenth(double[] array){
        System.out.println("Max element: " + findMax(array));
    }


    static void eleventh(){
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


    static void twelfth(){
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


    static void thirteenth(){
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


    static double findMin(double[] array){
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static double findMax(double[] array){
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    static double nNumAverage(double[] arr){
        double sum = 0;
        for (double i:arr) {
            sum += i;
        }
        return sum / arr.length;
    }

}
