package com.company;

import java.util.Scanner;

public class MoneyFromDeposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit value (in UAH): ");
        double deposit = input.nextDouble();
        System.out.print("\nPer cent of annual: ");
        double percent = input.nextDouble();
        System.out.print("\nTerm of the deposit: ");
        double term = input.nextDouble();
        depositInfo(deposit, percent, term);
        input.close();
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
