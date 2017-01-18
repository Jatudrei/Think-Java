/**
 * Created by stu on 18/01/17.
 */

public class checkFermat {
    public static void main (String[] args) {
        int a = 412;
        int b = 315;
        int c = 420;
        int n = 6;
        check(a, b, c, n);
    }
    public static void check (int a, int b, int c, int n) {
        if(Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n > 2) {
            System.out.println("Exponential powers, Batman, Fermat was wrong!");
        }
        else {
            System.out.println("Nope, this looks like Fermat would expect.");
        }

    }
}
