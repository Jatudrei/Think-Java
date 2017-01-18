/**
 * Created by stu on 04/01/17.
 */
import java.util.Scanner;

/**
 *  Converts centimeters to feet and inches.
 */
public class EnglishMetricConversion {
    public static void main (String[] args) {
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);

        // get value
        System.out.print("How many centimeters?  ");
        cm = in.nextDouble();

        // conversion and output
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
    }

}
