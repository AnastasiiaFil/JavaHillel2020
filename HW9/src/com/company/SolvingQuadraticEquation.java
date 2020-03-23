package com.company;
import java.lang.Math;

public class SolvingQuadraticEquation {
    private double a;
    private double b;
    private double c;

    public SolvingQuadraticEquation(double number1, double number2, double number3){
        this.a = number1;
        this.b = number2;
        this.c = number3;
    }

    public double[] solve(){
        double D = b * b - 4 * a * c;
        double[] result = new double[]{(-b - Math.sqrt(D))/(2 * a), (-b + Math.sqrt(D))/(2 * a)};
        return result;
    }
}
