/**
 * Created by stu on 02/01/17.
 */

public class TempConv {
    public static void main(String[] args){
        double fahr;
        double cel;
        java.util.Scanner in;

        in = new java.util.Scanner(System.in);
        System.out.println("Enter the temperature in degrees Fahrenheit: ");
        fahr = in.nextDouble();

        cel = (fahr - 32) * 5.0/9.0;
        System.out.println("The temperature in degrees Celsius is: " + cel);

        System.exit(0);
    }
}
