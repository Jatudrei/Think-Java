/**
 * Created by stu on 18/01/17.
 */

import java.util.Scanner;

public class bottlesOfBeer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many bottles shall we start with, master?   ");
        int bottles = scanner.nextInt();
        System.out.println(" ");
        sing(bottles);
    }

    public static void sing(int n) {
        if (n > 0) {
            singMultiple(n);
        } else {
            singEnd();
        }
    }

    public static void singMultiple(int n) {
        String num = Integer.toString(n);
        String newNum = Integer.toString(n - 1);
        System.out.println(num + " bottles of beer on the wall,");
        System.out.println(num + " bottles of beer,");
        System.out.println("Take 1 down, pass it around,");
        System.out.println(newNum + " bottles of beer on the wall.");
        System.out.println(" ");
        if (n - 1 > 0) {
            singMultiple(n - 1);
        } else {
            singEnd();
        }
    }

    public static void singEnd() {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("No bottles of beer,");
        System.out.println("The party's done, no more fun");
        System.out.println("No more bottles of beer on the wall!");
    }

}