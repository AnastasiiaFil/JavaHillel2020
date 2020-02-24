package com.company;

public class Main {
    public static void main(String[] args) {
        Car auto = new Car(50, 10, 20);

        auto.fuelLeft(120);
        auto.howMuchAdd();
        auto.setFullTank();

        auto.fuelLeft(180);
        auto.howMuchAdd();
        auto.setFullTank();

        auto.fuelLeft(150);
        auto.howMuchAdd();

        auto.showSpentMoney();
    }
}
