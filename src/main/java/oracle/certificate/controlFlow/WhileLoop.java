/**
 * Created by:Wondafrash
 * Date : 4/1/2024
 * Time : 1:46 PM
 */
package oracle.certificate.controlFlow;

public class WhileLoop {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;

        while(x < 6){
           y++;
           x++;
            //1. iteration y=6 ; x=3
            //2. iteration y=7 ; x=4
            //3. iteration y=8 ; x=5
            //4. iteration y=9 ; x=6
        }
        //System.out.println("x="+x +":"+"y=" +y);

        int a = 5;
        int b = 7;

        while(a > 6){// this part will be skipped bc a=5
            b += 2;// b = b + 2
            a++;
        }

        a = a > 6 ? a++: b--; // the "--b" segment would be executed

        System.out.println("a="+a +" : " +"b="+b +" : "+ "(a + b)=" + (a + b));
        //a=5 b=15 (5 + 14)
    }
}
