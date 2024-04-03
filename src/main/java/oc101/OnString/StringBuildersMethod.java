/**
 * Created by:Wondafrash
 * Date : 4/3/2024
 * Time : 8:56 AM
 */
package oc101.OnString;

public class StringBuildersMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Wondafrash");
        String ss1 = sb.substring(sb.indexOf("a"), sb.indexOf("s"));
        int ss2 = sb.length();
        char ss3 = sb.charAt(7);
        int ss4 = sb.capacity();

        System.out.println("Subs="+ss1 + "  Len="+ss2 +" charAt(7)="+ss3 + "  Capacity =" + ss4);

        //append() return a reference to current sb-objects
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Jack").append(7).append("-%-&-");
        sb1.append(789L);
        System.out.println(sb1);

        //insertAtChar() return a reference to current sb-objects
        StringBuilder sb3 = new StringBuilder("Wondafrash");
        sb3.insert(5, "-");
        sb3.insert(2, "-MESS-");
        System.out.println("sb is mutable  :"+sb3); // muted string "WoM E S Snda-fr78ash" is printed
        sb3.delete(3,6);
        System.out.println("sb is mutable  :"+sb3);

        System.out.println();
        // reverse method
        StringBuilder ssb = new StringBuilder("Wondafrash");
        ssb.reverse().reverse();
        System.out.println("Revers :"+ssb);

        //toString method
        StringBuilder sbs = new StringBuilder("Wondafrash");
        sbs.append("-Messele");
        String st = sbs.toString();
        //st.replaceAll("-Messele", ""); toString method make sb immutable
        System.out.println("toString() : "+st);
        System.out.println();

        //validate String is immutable
        String str = new String("Wondafrash");
        str.replaceAll("N", "-%-$-");
        str.replace('f','J');
        System.out.println("String immutable : "+str); // Original string "Wondafrash" will be printed


    }
}
