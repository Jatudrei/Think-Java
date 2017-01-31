/**
 * Created by Yehoshua Kahan on 04/01/17.
 * A simple "guess the number" game.
 */

import java.util.Random;
import java.util.Scanner;

public class random_number {
    public static void main(String[] args) {
        int number;
        int guess;

        // picking a random number
        Random random = new Random();
        number = random.nextInt(100) + 1;

        // prompting the user
        System.out.println("I'm thinking of a number.  The number is an integer, it is at least 1, and it is not" +
                " greater than 100.  Can you guess it?");

        game(number);
    }

    public static void game(int number) {
        // responding
        int guess;

        // scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nType a number:   ");
        guess = scanner.nextInt();

        System.out.printf("You guessed %d\n", guess);

        if (guess == number) {
            System.out.println("\nCongratulations, you win!");
            System.exit(0);
        }
        if (guess < number) {
            System.out.println("That number is too low.");
        } else if (guess > number) {
            System.out.println("That number is too high.");
        }

        game(number);
    }
}
