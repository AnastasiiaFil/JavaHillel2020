package com.company;

public abstract class Animal {
    private int id;
    private int age;
    private double weight;
    private String color;
    static int counter=1;

    Animal(){
        id = counter++;
    }

    public void displayId(){
        System.out.println("Id: " + id);
    }

    public void Voice(){
        System.out.print("Hello, ");
    }

    public void setAge(int Age){
        age = Age;
    }

    public void getAge(){
        System.out.println("My age is: " + age);
    }

    public void setWeight(double Weight){
        weight = Weight;
    }

    public void getWeight(){
        System.out.println("My weight is: " + weight);
    }

    public void setColor(String Color){
        color = Color;
    }

    public void getColor(){
        System.out.println("My color is " + color);
    }
}
