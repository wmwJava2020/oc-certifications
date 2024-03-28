package oc101.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        //case for count senario
        //int cnt = 0;
        //System.out.println("cnt = 0: "+cnt);   //cnt =0
        //System.out.println("cnt = 0: "+cnt++); //cnt = 0, but cnt value is increased by 1
        //System.out.println("cnt = 1: "+cnt); //cnt = 1, but cnt value is increased by 1
        //System.out.println("cnt = 1: "+cnt--); // will print 1 , but cnt value is 0
        //System.out.println("cnt = 0: "+cnt);   // print 0

        //int x = 3;
        //int y = ++x * 5 / x-- + --x;
        // y =4*5 / 4
        // y = 20/4 + 2
        // x = 5  and y=2
        //System.out.println("x="+ x +" : "+ "y="+y);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        //i = ++h(3) + --g(5) * 3 + 2 + g++(5, but is 6) - h--(3) % --g(5)
        //3 + 5 * 3 + 2 * 5 -3 % 5
        //3 + 15 + 10 - 3 % 5
        // 28 - 3 % 5
        // 25 % 5
        // 2
        System.out.println("g="+g+" : " +"h="+h+" : "+"i="+i);

        byte t = -128;
        byte u = 127;
        //byte zs = u + 1;


        // adding two short data types in this case two short data type would be up-promoted to int, so we have to cast it to short
       short s = 3;
       short tt = 6;
       short ts = (short)(s + tt);
        System.out.println(ts);
    }

}
