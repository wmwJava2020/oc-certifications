/**
 * Created by:Wondafrash
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
        System.out.println("for loop  : "+str);

        System.out.println();

        StringBuilder sb = new StringBuilder();

        for(char c = 'a'; c <= 'z';c++ ){
            sb.append(c+" ");
        }
        System.out.println("Sb append : "+sb);

        System.out.println();
         StringBuilder sb1 = new StringBuilder("first-");
         StringBuilder sb2 = sb1.append("second-");
         StringBuilder sb3 = sb2.append("third");

         //New sb object created to test sb.append()
         StringBuilder sbb = new StringBuilder();
         StringBuilder test = sbb.append(sb3);
         System.out.println("test append() : "+test);

        System.out.println();

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        // since we initiate only one sb object, all sb1, sb2, and sb3 will print "first-second-third"
        // because they refer to same sb object
        // the outcome of sb2 and sb3 will also be appended to sb object.

        System.out.println();

        System.out.println(System.identityHashCode(sb1));
        System.out.println(System.identityHashCode(sb2));
        System.out.println(System.identityHashCode(sb3));

        System.out.println();

        StringBuilder sbs = new StringBuilder();
        int length = sb1.length();
        System.out.println("Length= "+length);
        int capacity = sb1.capacity();
        System.out.println("Capacity= "+capacity);

        System.out.println();

        StringBuilder ssb = new StringBuilder();

        System.out.println("initials capacity : = "+ssb.capacity()); // initial capacity is 16 by default
        System.out.println("initials  size    : = "+ssb.length()); // initial length would be 0 by default

        System.out.println();

        StringBuilder sbs1 = ssb.append("Wondafrash");
        System.out.println("Text added Capa  : "+sbs1.capacity());
        System.out.println("Append-Txt Len   : "+sbs1.length());

        System.out.println();

        StringBuilder sbs2 = ssb.append("a b c d e f g h i j k l m n o p q r s t u v w x y z "); //String will automatically increase capacity
        System.out.println("post capacity = "+ssb.capacity());
        System.out.println("post length   = "+ssb.length());

    }
}
