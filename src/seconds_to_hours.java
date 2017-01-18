/**
 * Created by Yehoshua Kahan on 04/01/17.
 * Converts n seconds into hours, minutes, and seconds.
 */


import java.util.Scanner;

public class seconds_to_hours {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int seconds;
        int hours;
        int minutes;

        // getting input
        System.out.print("How many seconds?  ");
        seconds = in.nextInt();

        // calculating
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;

        // outputting message
        System.out.printf("%d seconds = %d hour(s), %d minute(s), and %d second(s)", seconds, hours, minutes,
                (seconds - hours * 3600 - minutes * 60));

    }
}
