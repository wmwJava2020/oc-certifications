package oracle.certificate.operators;

public class CompoundOperators {

    public static void main(String[] args) {
        //int x = 4;
       // int y = 3;

       // x = x * y;
       // x *= y; // x = x * y;
        //System.out.println("x= "+ x);

        int a = 4;
        long l = 3;

      //int rr = a * l; // doesn't compile need cast to int

       a = a*=l;
      // a = (int) (a * l);

        //System.out.println("r = "+ a);
        System.out.println();
        long x = 4;
        long y = (x += 2);
        //System.out.println("x="+x);
        //System.out.println("y="+y);

        long e = 3;
        long f = 2;
        long g = 1;

        long h = e + 3 * (f = 3) - (g -= 2); // g = g -2 g --> g = 1-2 = -1
        //4 + 3 * 3 - (-1)
        //4 + 9 - 1;
        // 13
        System.out.println("h="+h +" "+"e="+e+ " "+"f="+f+" "+"g="+g);





    }
}
