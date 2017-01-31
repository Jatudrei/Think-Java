package com;

/**
 * Created by stu on 31/01/17.
 */

public class chap_7_exercises {
    public static void main (String[] args) {
        System.out.println(gauss(6, 4));
        }

    public static double squareRoot(double x) {
        double x0 =x/2;
        double x1 = x0 + 1;
        while (Math.abs(x1-x0) > 0.0001) {
            x1 = x0;
            x0 = (x0 + x/x0)/2;
        }
        return x0;
    }
    public static double power(double x, int n) {
        double x0 = x;
        for (int i = 1; i < n; i++) {
            x *= x0;
        }
        return x;
    }
    public static int factorial (int x) {
        int x1 = x;
        while (x > 1) {
            x1 *= (x-1);
            x -= 1;
        }
        return x1;
    }
    public static double myexp(double x, int n) {
        double estimate = 1;
        double numerator = x;
        double denominator = 1;
        for (int i = 2; i <= n; i++) {
           // estimate += (power(x, i-1))/factorial(i-1);
            estimate += numerator/denominator;
            numerator *= x;
            denominator *= i;
        }
    return estimate;
    }
    public static void check (double x){
        System.out.print(x + "\t" + myexp(x, 20) + "\t" + Math.exp(x) + "\n");
    }
    public static double gauss(int x, int n) {
        double sol = 1;
        int numerator = x * x;
        int denominator = 1;
        boolean minus = true;
        for (int i = 1; i < n; i++) {
            if (minus) {
                sol -= numerator / denominator;
                minus = false;
            } else {
                sol += numerator / denominator;
                minus = true;
            }
            numerator *= x * x;
            denominator *= i + 1;

        }
        return sol;
    }
}
