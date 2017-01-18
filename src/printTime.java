/**
 * Created by stu on 09/01/17.
 */
import java.util.Scanner;

public class printTime {
    public static void printTime(int hour, int minute) {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }
    public static void main (String[] args) {
        int hour = 11;
        int minute = 59;
        printTime(hour + 1, 0);
        String input ="1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input);

    }

}
