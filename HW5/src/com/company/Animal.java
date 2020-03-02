package com.company;

import java.awt.*;

public abstract class Animal {
    private int id;
    private int age;
    private double weight;
    private String color;
    static int counter=1;

    Animal(int age, double weight, String color){
        id = counter++;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void Voice(){
        System.out.print("Hello, ");
    }

    public void showId(){ System.out.println("Id: " + id); }

    public void showAge(){ System.out.println("My age is: " + age); }

    public void setAge(int Age){
        age = Age;
    }

    public void showWeight(){
        System.out.println("My weight is: " + weight);
    }

    public void setWeight(double Weight){
        weight = Weight;
    }

    public void showColor(){
        System.out.println("My color is " + color);
    }

    public void setColor(String Color){
        color = Color;
    }

    @Override
    public String toString() {
        return "Id = " + id + "; Age = " + age + "; Weight = " + weight + "; Color = " + color;
    };
}
