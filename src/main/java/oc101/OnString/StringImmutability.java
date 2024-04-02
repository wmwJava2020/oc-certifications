/**
 * Created by:AIDA
 * Date : 4/2/2024
 * Time : 11:34 AM
 */
package oc101.OnString;

public class StringImmutability {
    public static void main(String[] args) {
        String hello = "hello";
        String hi = hello + "world";
        hi = hello;
        System.out.println(hi + hello);

        hello.toUpperCase();
        hi.toUpperCase();

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println("s1= "+s1);
        System.out.println("s2= "+s2);
    }
}
