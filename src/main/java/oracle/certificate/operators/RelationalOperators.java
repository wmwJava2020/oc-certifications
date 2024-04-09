package oracle.certificate.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = 2;

        System.out.println("x <  y  : " + (x < z));
        System.out.println("x <  y  : " + (x <= y));
        System.out.println("x >  y  : " + (z > y));
        System.out.println("x >= y  : " + (x >= y));

        System.out.println();

        int a = 5;
        long b = 7l;
        double c = 3.3;

        System.out.println("int = a   <  long = b " + (a < b));
        System.out.println("int = a   >= long = b " + (a >= b));
        System.out.println("double = c >  int = a " + (c > a));
        System.out.println("long = b > double = c " + (b > c));

        System.out.println();

        System.out.println((a > b) +" : "+ (c <=b));

    }
}
