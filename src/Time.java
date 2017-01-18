/**
 * Created by stu on 04/01/17.
 */
public class Time {
    public static void main (String[] args){
        double hour;
        double minute;
        double second;
        double totalSeconds;
        double SECONDSINDAY;
        double secondsPassed;
        double percentDayPassed;
        double newHour;
        double newMinute;
        double newSecond;
        double timeForExercise;
        String secondsPassedMessage;
        String secondsLeftMessage;
        String percentDayPassedMessage;
        String timeForExerciseMessage;
        hour = 12.0;
        minute = 35.0;
        second = 7.0;
        newHour = 12.0;
        newMinute = 47.0;
        newSecond = 59.0;
        timeForExercise = -(hour * 60 * 60 + minute * 60 + second) + (newHour * 60 * 60 + newMinute * 60 + newSecond);
        SECONDSINDAY = 24 * 60 * 60;
        secondsPassed = hour * 60 * 60 + minute * 60 + second;
        percentDayPassed = secondsPassed / SECONDSINDAY;
        secondsPassedMessage = "Since midnight, approximately " + secondsPassed + " seconds have elapsed.";
        System.out.println(secondsPassedMessage);
        secondsLeftMessage = "There are approximately " + (SECONDSINDAY - secondsPassed) + "seconds left until midnight";
        System.out.println(secondsLeftMessage);
        percentDayPassedMessage = "About " + (percentDayPassed * 100)+ "% of the day has already passed.";
        System.out.println(percentDayPassedMessage);
        timeForExerciseMessage = "While I worked on this exercise, about " + timeForExercise + " seconds passed.";
        System.out.println(timeForExerciseMessage);
        System.out.println(System.out);
        System.out.println(System.in);


    }
}
