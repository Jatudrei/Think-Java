package com;

/**
 * Created by stu on 15/01/17.
 */
public class relational_operators {
    public static void main(String[] args) {
        displayBinary(32000);
    }

    public static void displayBinary (int n) {
        if (n > 0) {
            displayBinary(n / 2);
            System.out.print(n % 2);
        }

    }

}

