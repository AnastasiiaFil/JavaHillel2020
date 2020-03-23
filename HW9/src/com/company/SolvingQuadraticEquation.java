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


    public void solve() throws Exception {
        double d = b * b - 4 * a * c;
        if (d < 0){
            throw new Exception("\nDecriminant less than 0: no real solutions!");
        }
        else if(d == 0){
            System.out.println("\nDecriminant equals 0: the solution is X = " + -b / (2 * a));
        }
        else if(d > 0){
            System.out.printf("\nDecriminant greater than 0: solutions are X1 = %f, X2 = %f", (-b - Math.sqrt(d)) / (2 * a), (-b + Math.sqrt(d)) / (2 * a));

        }

    }
}
