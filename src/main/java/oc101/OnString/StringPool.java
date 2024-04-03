/**
 * Created by:Wondafrash
 * Date : 4/2/2024
 * Time : 12:49 PM
 */
package oc101.OnString;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Jack";
        String s2 = "Jack";
        String s3 = new String("Jack");
        String s4 = "Ja" + "ck";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
        System.out.println(s1==s3); // false because it refers to different memory location due to NEW key word
        System.out.println(s1.equals(s3));

        int i = s1.hashCode();
        int i1 = s2.hashCode();
        int i2 = s3.hashCode();
        int i3 = s4.hashCode();
        System.out.println("hashCode = "+i);
        System.out.println("hashCode = "+i1);
        System.out.println("hashCode = "+i2);
        System.out.println("hashCode = "+i3);

        System.out.println("identityHashCode = "+System.identityHashCode(s1));
        System.out.println("identityHashCode = "+System.identityHashCode(s2));
        System.out.println("identityHashCode = "+System.identityHashCode(s3));
        System.out.println("identityHashCode = "+System.identityHashCode(s4));

    }
}
