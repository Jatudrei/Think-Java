/**
 * Created by stu on 03/01/17.
 */
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {


        printBoth("Saturday", "January", "14", "2017");

    }

    public static void printAmerican(String weekday,
                                     String month,
                                     String date,
                                     String year) {
        String American = weekday + ", " + month + " " + date + ", " + year;
        System.out.println("\nAmerican Format:\n" + American);

    }

    public static void printEuropean(String weekday,
                                     String month,
                                     String date,
                                     String year) {
        String European = weekday + " " + date + " " + month + " " + year;
        System.out.println("\nEuropean Format:\n" + European);
    }

    public static void printBoth(String weekday,
                                 String month,
                                 String date,
                                 String year) {
        printAmerican(weekday, month, date, year);
        printEuropean(weekday, month, date, year);
    }
}
