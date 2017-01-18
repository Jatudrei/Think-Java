/**
 * Created by stu on 04/01/17.
 */
import java.util.Scanner;

public class name_and_age {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int age;
        String name;

        System.out.print("What is your age?  ");
        age = in.nextInt();
        in.nextLine();
        System.out.print("What is your name?  ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }
}
