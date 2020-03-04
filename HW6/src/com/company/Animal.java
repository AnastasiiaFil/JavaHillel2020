package com.company;

public abstract class Animal implements Voice{
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


    public void voice(){
        System.out.print("Hello, ");
    }

    public void setAge(int Age){
        age = Age;
    }

    public void setWeight(double Weight){
        weight = Weight;
    }

    public void setColor(String Color){
        color = Color;
    }

    @Override
    public String toString() {
        return "Id = " + id + "; Age = " + age + "; Weight = " + weight + "; Color = " + color;
    };
}
