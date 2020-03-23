package com.company;
import java.lang.Math;

public class SolvingQuadraticEquation {
    private double a;
    private double b;
    private double c;

    public SolvingQuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] solve(){
        double D = b * b - 4 * a * c;
        double[] result = new double[]{(-b - Math.sqrt(D))/(2 * a), (-b + Math.sqrt(D))/(2 * a)};
        return result;
    }
}
