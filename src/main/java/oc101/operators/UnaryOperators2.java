package oc101.operators;

public class UnaryOperators2 {

    public static void main(String[] args) {

        int l = 4;
        int q = 12;
        int n = q % l;
        // 12 / 4 = 3
        // 4 * 3 = 12
        // 12 - 12 = 0
        System.out.println(n);

        int i = 3;
        int j = 10;

        int k = j % i;
        // 10 / 3 = 3 ;
        // 3 * 3 = 9
        // 10 - 9  = 1
        System.out.println(k);

       int a = 3;
       int b = 14;
       int c = b % a;
        // 14 / 3 = 4
        // 3 * 4 =  12
        // 14 - 12 = 2
        System.out.println(c);

        int f = 12;
        int g = 5;
        int h = 2;

        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;
        // 12 / 2 - 10 % (4 + 3) - 2 * 12 % 5 - 2 * 3
        // 6 - 10 % 7 - 2 * 12 % 5 - 2 * 3
        // 6 - 3 - 24 % 5 - 2 * 3
        // 3 - 4 - 2 * 3
        // -1 - 6
        //-7
        System.out.println(m);

        int aa = 4;
        int bb = 3 * 4 + 3 - 2 + --a;
        System.out.println("aa:"+aa +" "+ "bb:"+bb);

        int x = 5;
        int y = 1 + (2 * 2) + 1 + x--;
        //1 + 4 + 1 +4
        //5+ 5
        System.out.println("x:" + x +" "+ "y:" + y);

        int rs = 3 -2 + 2 * 2 + 3;
        // 3 - 2 + 4 + 3
        // 1 + 4 + 3

        long cc = 4;
        long d = 4 + 2 * ++cc; // increase and use
        //4 + 8
        System.out.println("c:"+c +" "+ "d:"+d);

        int qq = 3;
        int r = 3 + 2 / 4 * 2 + qq++; //first use and increase
        // 3 + 0 + 3
        // 3 + 0+  3
        // 6
        System.out.println("q:"+qq +" "+ "r:"+r);

        rs = 10 + (2 +1) - (4 / 2) * 2;
        //10 + 3 - 2 * 2
        //13 - 4
        //9
        System.out.println(rs);
    }
}
