package com.company;

public class Car {
    private double fuel_tank;
    private double fuel_balance;
    private double fuel_consumption;
    private double fuel_price;
    private double money_spent;

    Car(double fuelTank, double fuelConsumption, double fuelPrice){
        this.fuel_tank = fuelTank;
        this.fuel_balance = fuelTank;
        this.fuel_consumption = fuelConsumption;
        this.fuel_price = fuelPrice;
    }

    void setFullTank(){
        var fuel_rest = fuel_tank - fuel_balance;
        fuel_balance += fuel_rest;
        money_spent += fuel_rest * fuel_price;
        System.out.println("Tank is full, money spent: " + money_spent);
    }

    void fuelLeft(double N){
        fuel_balance -= fuel_consumption * N / 100;
        System.out.println("Fuel left in the tank: " + fuel_balance);
    }

    void howMuchAdd(){
        var fuel = fuel_tank - fuel_balance;
        System.out.println("Need to refuel to a full tank: " + fuel + " liters to a full tank. Price for this amount of fuel: " + (fuel * fuel_price));
    }

    void showSpentMoney(){
        System.out.println("\n\nPrice of trip: " + money_spent);
    }
}
