/**
 * Created by stu on 09/01/17.
 */
public class PrintTwice {

    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }

    public static void main(String[] args) {
        printTwice("Don't make me say this twice!");
        String argument = "Never say never!";
        printTwice(argument);
        printTwice("17");
        System.out.println(Math.sqrt(25));
    }
}
