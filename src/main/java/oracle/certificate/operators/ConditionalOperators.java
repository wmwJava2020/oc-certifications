package oracle.certificate.operators;
public class ConditionalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean d = a && b;
        boolean e = a || c;
        boolean f = c ^ a;
       // System.out.println("d="+e+ " : e="+e +" : f="+f);

        int g = 4;
        boolean h = false && (g++ < 4); //false
        boolean i = (g-- == 4) && !h; // true
        //System.out.println(g);
        //System.out.println("h="+h +" : "+"i="+i);

        int x = 3;
        int y = 4;
        boolean bb = (x <= 3) && (y-- == 4) || (x++ == 4);
        //x <= 3 = ture
        // y-- ==4 = ture
        // x++ ==4 = false
        // t & t = t || f == t
        //System.out.println("bb= " +bb);
        //System.out.println("x="+x);
        //System.out.println("y="+y);

        boolean k = true, l = true;
        int m = 20;
        k = (m !=10) ^ (l = false); // < ---- this expression set l to false
        //    t ^ f
        // k = t
        System.out.println("k="+k);


    }

}
