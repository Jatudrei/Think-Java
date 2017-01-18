/**
 * Created by stu on 04/01/17.
 */



public class Echo {
    public static void main (String[] args) {
        String response;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Type something!");
        response = scanner.nextLine();
        System.out.println("You said: \""+ response + "\"");
    }
}
