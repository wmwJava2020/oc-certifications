package oracle.certificate.introduction;


import java.util.Date;
import java.util.Random;
import static java.lang.System.out;


public class Employee {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].toString().startsWith("M"))
                System.out.println("args[" + i + "] = " + args[i]);
        }

        Random rr = new Random();

        System.out.println(rr.nextInt(5));

        java.util.Date ut = new Date();
        int date;
        java.sql.Date sq = new java.sql.Date(1979, 5, 25);
        out.println(ut.toString());
        out.println(sq.toString());

        int x;
        x = Math.abs(6);
        double y;
        y = Math.sqrt(2);
    }
}
