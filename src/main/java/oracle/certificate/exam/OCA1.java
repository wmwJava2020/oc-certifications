/**
 * Created by:Wondafrash
 * Date : 5/16/2024
 * Time : 6:38 AM
 */
package oracle.certificate.exam;

public class OCA1 {
    //private Date rob = new Date();
    //private java.util.Date sharon = new java.util.Date();

    //static String weight = "A Lot";
    /*default*/ double ages = 5, age1 = 5;
    //private static boolean  success = true;


    private static int yst = 1;
    int tmr = 2;

    public String colors;
    public void attach(){
        //public String color;
    }

    public String color;

    static double dbl = 23d;
    static Float flt = 2.3f;
    public static void main(String[] args) {
        OCA1 oca = new OCA1();
        int tod =3,tmr =4;
        System.out.println(tod + oca.tmr + oca.yst);

        //int Integer = 0;
        //Integer int = 0;

        Double d1 = dbl;  // converting a primitive data type into an object wrapper type - boxing
        d1.doubleValue(); // Unnecessary unboxing
        System.out.println(d1);

        float f0 = flt; // converting an object wrapper type back to its corresponding primitive data type.Integer back to an int.

        Integer integer = new Integer(4);
        System.out.print(integer.byteValue());
        System.out.print(" - ");
        Integer integer0 = new Integer(4);
        System.out.print(integer0.byteValue());

        String cat, dog = "Animals";
        Byte b;
        char c;

    }
}
