/**
 * Created by:AIDA
 * Date : 3/28/2024
 * Time : 8:28 AM
 */
package oc101.operators;
public class EqualityOperators {
    public static void main(String[] args) {
         int a = 4;
         int b = 6;
         boolean t = a == b;
         int c = 2;
         boolean d = c == a;
         int e = a++;
         int f =--c;
         int g = b*=a; // b= b*a b = 6 * 5
         int h = (a-=c) - (b*=a) + (c+=5) / 5;

//        System.out.println("d="+d);
//        System.out.println("t="+t);
//        System.out.println("c="+c);
//        System.out.println("f="+f);
//        System.out.println("e="+e);
//        System.out.println("a="+a);
//        System.out.println("g="+g);
//        System.out.println("h="+h);

        boolean x = true;
        boolean y = false;

        boolean z =  (x = false) ^ (y=true);  // would make x value false
        boolean z0 = (x = false) && (y=true); // would make y value false / assignment
        boolean xx = (x ==false) && (x == true); // tests equality
        boolean z1 = (x = true) || (y=true);

        System.out.println("x=f & y=t  :  "+z0);
        System.out.println("x==f & y==t:  "+xx);
        System.out.println("z0="+z0);
        System.out.println("z1="+z1);

    }

}
