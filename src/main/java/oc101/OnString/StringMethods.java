/**
 * Created by:Wondafrash
 * Date : 4/2/2024
 * Time : 1:52 PM
 */
package oc101.OnString;

import java.time.LocalDateTime;

public class StringMethods {
    public static void main(String[] args) {
        String str = " Wondafrash  ";
        String str1 = str.substring(5,10);

        System.out.println(str.length());
        System.out.println(str.replace("h", "h"));
        System.out.println(str.indexOf("f"));
        System.out.println(str.charAt(9));
        System.out.println(str.substring(5,5)); // just empty string will be printed
        System.out.println(str.substring(5,10));
        System.out.println(str.toUpperCase()); //new string will be created for upper case scenario
        System.out.println(str); // original string stays the same

        System.out.println(str.indexOf('s',5));
        System.out.println(str.trim());

        for(int i = 10; i < 20; i++){
            Long tm0 = System.currentTimeMillis();
            String tm1 = tm0.toString().substring(5,9);
            Long tm2 = System.currentTimeMillis();
            String tm3 = tm2.toString().substring(3,7);
            LocalDateTime dt = LocalDateTime.now();


            //System.out.println( tm1+i +"-"+ tm3+i );
            System.out.println(dt.toString().substring(0,7).concat(String.valueOf(i)));
            //System.out.println(   dt.getDayOfMonth());
        }

    }
}
