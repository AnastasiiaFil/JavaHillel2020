package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Menu tasks = new Menu();
        ArrayTasks arr = new ArrayTasks();
        NumbersManipulation num_man = new NumbersManipulation();
        Loops loops = new Loops();
        int menu;
        do {
            tasks.printMenu();
            Scanner in = new Scanner(System.in);
            System.out.print("\n\nEnter menu number: ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    loops.first();
                    break;
                case 2:
                    loops.second();
                    break;
                case 3:
                    System.out.print("Would you like to find factorial? (yes/no): ");
                    String choice1 = in.next();
                    if(choice1.toLowerCase().equals("yes")) loops.third_2();
                    else if(choice1.toLowerCase().equals("no")) loops.third_1();
                    else System.out.println("Input Error: enter yes/no ");
                    break;
                case 4:
                    System.out.print("Would you like to find factorial? (yes/no): ");
                    String choice2 = in.next();
                    if(choice2.toLowerCase().equals("yes")) loops.fourth_2();
                    else if(choice2.toLowerCase().equals("no")) loops.fourth_1();
                    else System.out.println("Input Error: enter yes/no ");
                    break;
                case 5:
                    num_man.fifth();
                    break;
                case 6:
                    num_man.sixth();
                    break;
                case 7:
                    num_man.seventh();
                    break;
                case 8:
                    num_man.eighth();
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

                    arr.ninth(array);
                    System.out.print("Complete task 10? (yes/no): ");
                    String choice3 = in.next();
                    if(choice3.toLowerCase().equals("yes")) arr.tenth(array);
                    break;
                case 10:
                    System.out.println("Task 9 should be done first.");
                    break;
                case 11:
                    arr.eleventh();
                    break;
                case 12:
                    arr.twelfth();
                    break;
                case 13:
                    arr.thirteenth();
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










}
