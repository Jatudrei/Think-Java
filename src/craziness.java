/**
 * Created by stu on 18/01/17.
 */
public class craziness {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        }
        else {
            System.out.println("!");
        }
    }

    public static void main (String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.println("It's a ");
        zoop("breakfast ", fork);
    }

    public static void ping(String stranStrung) {
        System.out.println("any " + stranStrung + "more ");
    }
}
