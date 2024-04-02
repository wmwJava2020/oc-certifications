/**
 * Created by:AIDA
 * Date : 4/2/2024
 * Time : 4:24 PM
 */
package oc101.OnString;

import java.lang.StringBuilder;
public class StringBuilders {


    public static void main(String[] args) {
        String str = " ";

        for(char c = 'a'; c <= 'z'; c++){
            str = str + c +" ";
        }
        System.out.println(str);

        System.out.println();

        StringBuilder sb = new StringBuilder();

        for(char c = 'a'; c <= 'z';c++ ){
            sb.append(c+" ");
        }
        System.out.println(sb);

        System.out.println();
         StringBuilder sb1 = new StringBuilder("first-");
         StringBuilder sb2 = sb1.append("second-");
         StringBuilder sb3 = sb2.append("third");

        System.out.println();

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        System.out.println();

        System.out.println(System.identityHashCode(sb1));
        System.out.println(System.identityHashCode(sb2));
        System.out.println(System.identityHashCode(sb3));

        StringBuilder sbs = new StringBuilder();
        int length = sb1.length();
        System.out.println("Length= "+length);
        int capacity = sb1.capacity();
        System.out.println("Capacity= "+capacity);

        System.out.println();

        StringBuilder ssb = new StringBuilder();
        System.out.println("initials = "+ssb.capacity()); // initial capacity is 16 by default
        System.out.println("initials = "+ssb.length()); // initial length would be 0 by default
        StringBuilder append1 = ssb.append(30);
        System.out.println("inc-cap = "+append1);
        StringBuilder append = ssb.append("Wondafrash a b c d e f g h i j k l m n o p q r s t u v w x y z "); //String will automatically increase capacity
        System.out.println("post = "+ssb.capacity());
        System.out.println("post = "+ssb.length());

    }
}
