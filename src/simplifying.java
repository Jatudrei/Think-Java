/**
 * simplifying the following into code using only one if statement
 *
 * if (x > 0) {
 *     if (x < 10) {
 *         System.out.println("positive single digit number.");
 *     }
 * }
 */
public class simplifying {
    public static void main (String[] args){
        int x = 50;
        if (x > 0 && x < 10) {
            System.out.println("positive single digit number.");
        }
    }
}
