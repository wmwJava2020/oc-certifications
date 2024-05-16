/**
 * Created by:Wondafrash
 * Date : 5/16/2024
 * Time : 11:41 AM
 */
package oracle.certificate.exam;
public class NumericPromotions {
    public static void main(String[] args) {
        // NUMERIC PROMOTION RULES.............
        // RULE - ONE if two data types are different, java will promote it to a larger data type.

        byte _abc1 = 2;
        byte abcd = 20;
        short $abc1 = 6;
        double DOUBLE = 2.4;

        double _double = _abc1 + $abc1 + DOUBLE;
        System.out.println("_double      = " + _double);

        long test = _abc1 + abcd; // byte + byte could be promoted to long, int
        int Public0 = _abc1 + $abc1; // short + byte is promoted to int

        // RULE - TWO int < double, so the output (10.4) is double;
        int $TLC = 4;
        double _abc4 = 1.4;
        double Double = $TLC + _abc4;
        System.out.println("$TLC + _abc4 = " + $TLC + _abc4); // 10.4

        // integrals are a byte,short,int and long;
        // floating-point data are double and floats
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

        // RULE - THREE if integrals and floatings, the output is floating-points
        int Public = 5;
        float A$B = 3.6F;
        System.out.println("Public + A$B = " + Public + A$B); // 8.6

        int $TLC1 = 4;
        double _abc41 = 1.4;
        double Doubles = $TLC + _abc4;
        System.out.println("$TLC1 + _abc41 = " + $TLC1 + _abc41); // 10.4

        // if byte and short, it would be int
        byte _abc = 2;
        short $abc = 4;
        System.out.println("_abc + $abc = " + _abc + $abc);

        // RULE - FOUR small data type byte, char, short first promoted to an int data type when they are used with binary arithmetic operators
        int ab = 1;
        short cd = 4;
        byte ef = 9;
        char CHAR = 'a';

        int $ss = CHAR + ab * cd / ef;

        //System.out.println($ss);
        //*************************************************************//

        short lg = 8;
        int ts = lg * 2;

        //*************************************************************//
        int p = 5 * 4 % 3; // 20/3 = 18 reminder is 2
        System.out.println("p = " + p);

        int c = 7;
        int rs = 4;
        rs = rs += ++c;
        System.out.println(rs);

        int x1 = 2, x2 = 14;
        boolean b = x1 >= x2;
        if (b = true) // [b = true] is assignment operators NOT comparison
            System.out.println("YES");
        else System.out.println("NOPE");

        int x = 1, y = 15;
        while (x < 10) {
            y--;
            x++;
        }
        System.out.println("x=" + x + ":" + "y=" + y);

    }

    public static String convert(Object value){
        return value.toString();
    }
}
