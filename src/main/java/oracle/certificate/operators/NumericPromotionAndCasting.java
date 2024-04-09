package oracle.certificate.operators;

public class NumericPromotionAndCasting {

    public static void main(String[] args) {
        // JAVA PROMOTION RULES
        // RULE 1. two value having diff data types java will auto promote one of value to larger data type
        double d0 = 2.190;
        int i0 = 6;

        double add = d0 + i0;//Here java promoted int  = 6 to double value;
       // System.out.println("int value promoted to double: "+add);

        // RULE 2. When one value is integral(int,short and char) and other is floating-point,java will promote integral value
        // to floating-point(double,float) values data

        long l = 3l;
        float f1 = 2.023f;

        float rs = l + f1;
        //System.out.println("l + f1: "+ (f1 + l));
        //System.out.println("long value promoted to float: "+rs);

        // Casting is converting bigger into smaller data type.
        int i = 3;
        double d = 6.45;
        int rss = (int)(i + d); // < -- by casting double to int and double will lose (.45) precision
        //System.out.println("double+ int: "+ i + d);// without bracket value would be misleading 36.45
        //System.out.println("casting double to int : "+rss);

        // RULE  3. smaller data types like bit,short & char promoted to int
        int t = 125;
        byte b = 9;
        //short s = 7;

        int st = t + b ; // < -- auto casting
        byte bt = (byte) (t + b); // < -- need casting

        //System.out.println("BYTE value: "+bt);
        //System.out.println("INT value: "+st);

        double dl = 44.25;
        float fl = 3.35f;
        double ddl = dl + fl; // < -- float would be cast to double
        float f0 = (float) (fl + dl);
        //System.out.println(ddl);
        //System.out.println(f0);

        // smaller data types like bit,short & char promoted to int
        short j = 16;
        short k = 4;
        int m = j/k;
        //System.out.println("short by short cast to int : " + m);

        short x = 14; // cast to int
        float y = 13f; // cast to double
        double z = 30.14;

        double rs0 = x * y/z;


        System.out.println(rs0);



    }

}
