/**
 * Created by:AIDA
 * Date : 4/2/2024
 * Time : 11:15 AM
 */
package oc101.OnString;

public class StringConcatenate {
    public static void main(String[] args) {

        String ii = "a";
        String j = "A";
        System.out.println("a + b = "+ii + j);

        System.out.println();
        int a = 2;
        int b = 4;
        System.out.println("a(2) + b(4) = "+a + b);
        int x = 4;
        String y = "4";

        System.out.println("2 + 4 + y(4) = "+2 + x + y);

        System.out.println();
        int q = 12;
        int r = 12;
        System.out.println("r + q + : "+r + q);// "r + q + : " + 12 ; "r + q + : " + 12
        System.out.println("r + q + : "+(r + q));

        System.out.println();
        String str = "";
        for(int i = 0; i < 10;i++){
            str = str + i + " ";
        }
        System.out.println(str);
    }
}
