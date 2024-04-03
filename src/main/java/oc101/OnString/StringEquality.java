/**
 * Created by:Wondafrash
 * Date : 4/3/2024
 * Time : 9:53 AM
 */
package oc101.OnString;

public class StringEquality {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = sb1.append("Wondafrash");

        System.out.println(sb1 == sb2);
        //System.out.println("sb2 = "+sb2);
        System.out.println(sb1 == sb3);

        System.out.println();

        String s1 = "Java";
        String s2 = " Java".trim();// trim() Returns a NEW string whose value is this string, with any leading and trailing whitespace removed.
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
