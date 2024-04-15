/**
 * Created by:Wondafrash
 * Date : 4/15/2024
 * Time : 10:17 AM
 */
package oracle.certificate.OnMethods;

import java.util.ArrayList;
import java.util.List;

public class StaticInitializations {
    private static final String NAME;
    private static int r = 1;
    private static int SIZE;
    private static final int AREA;
    private static final int AREAS;
    private static final String name = "Jack";

    private final static List<String> ls = new ArrayList<>();

    static {
        System.out.println("Static ini-block-1");
        String s = "Na";
        String s1 = "ME";
        NAME = s + s1; // we can initialize here as well;

        int x = 3, y = 4, z = 5;
        AREA = x * y * z;
        SIZE = x * z;
        System.out.println(SIZE);
        AREAS = 7;
        SIZE = AREAS;
        //name = "Jack";

    }

    static {
        System.out.println("Static ini-block-2");
        //NAME = "MACK"; // final Variable 'NAME' might already have been assigned to
        SIZE = 4 * 6;
        System.out.println(SIZE);
        //AREA = 7 * 7; // final Variable 'AREA' might already have been assigned to
        //AREAS = SIZE;  // final Variable 'AREAS' might already have been assigned '7' above;
    }
    static {
        System.out.println("Static ini-block-3");
        ls.add("NAME-0");
        ls.add("NAME-1");

    }

    public static void main(String[] args) {
        System.out.println(ls);
    }


}
