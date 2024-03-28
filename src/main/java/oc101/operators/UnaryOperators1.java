package oc101.operators;

public class UnaryOperators1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int c = 9;
        int d = 7;

        int e = ++a;
        int f = --a;
        //int g = b++; // here g= 2  but b=b+1 so b=3
        //int h = b--; // h is 3, but b is decrease by 1, b=b-1
        //int i = c--;
        int j = --c;
        int k = d++;
        //int l = ++d; //first we have to use the value and assign it then increment it

        // System.out.println(" a = " +a + " : "+" e = "+e);    // a = 6, e=7

        // System.out.println(" f= " +f + " : "+" a= "+a);  // f = 5, a= 5

        //System.out.println(" g= " +g + " : "+" b= "+b); // g=2 b=2

        //System.out.println(" b= " +b + " : "+" h= "+h);  // b=2, h=1

        //System.out.println(" i= " +i + " : "+" c= "+c); // i=9, c=8

        //System.out.println(" j= " +j + " : "+" c= "+c); // j=8 , c=8

        //System.out.println(" k= " +k + " : "+" d= "+d);  //k=7, ,d=8

        //System.out.println(" l= " +l+ " : "+" d= "+d); // l=9, d=8










    }
}
