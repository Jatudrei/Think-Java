/**
 * Created by Yehoshua Kahan on 04/01/17
 * Converts temperatures from Celsius
 * to Fahrenheit
 */
import java.util.Scanner;

public class Cels_to_Fahr {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.print("Degrees Celsius?  ");
        celsius = in.nextDouble();
        fahrenheit = celsius * 1.8 + 32.0;
        System.out.printf("%.1f degrees Celsius = %.1f degrees Fahrenheit", celsius, fahrenheit);
    }
}
