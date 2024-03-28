/**
 * Created by:AIDA
 * Date : 3/28/2024
 * Time : 9:56 AM
 */
package oc101.operators;

public class ObjectEquality {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 6;

        System.out.println("i1= "+System.identityHashCode(i1));
        System.out.println("i2= "+System.identityHashCode(i2));

        System.out.println("int using == "+(i1 == i2)); //false

         // if both i1 and i2 are same value, they would have same hashCode value.
        //=====================================================================

        Integer x =  new Integer(128);
        Integer y = new Integer(128);

        System.out.println("x.equals(y): " + x.equals(y)); // comparing equality of two data value, so ture

        System.out.println();

        System.out.println("HashCode - x : "+System.identityHashCode(x));
        System.out.println("HashCode - y : "+System.identityHashCode(y));
        System.out.println();
        System.out.println("Hash of x & y : "+(x == y)); // comparing hashValue of x and y, so false
    }
}
