/**
 * Created by stu on 03/01/17.
 */
public class chap_2 {
    public static void main (String[] args){
        String message = "Hello!";
        double hour = 11;
        double minute = 59;
        double y = 1.0 / 3.0;
        System.out.println(y);
        double minutesPassed = hour * 60 + minute;
        System.out.println("Number of minutes since midnight: " + minutesPassed);
        double fractionHour = minute / 60;
        System.out.println("The fraction of an hour that has elapsed: " + fractionHour);
        double percentHour = minute * 100 / 60;
        System.out.println("The percent of an hour that has passed: " + percentHour + "%");
        System.out.println(0.1 * 10);
        System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1);
        System.out.println(1 + 2 + "Hello");
        System.out.println("Hello" + 1 + 2);
        System.out.println(1/0.9);

    }
}
