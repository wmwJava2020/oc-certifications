/**
 * Created by:Wondafrash
 * Date : 4/1/2024
 * Time : 2:25 PM
 */
package oracle.certificate.controlFlow;

public class DoWhileLoop {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        while (y < 10) {
            y++;
        }
        x += 2; //x = x + 2
        y += 5; //y = y + 5

        //1 iter   y=7 ; x =7
        //2 iter

        System.out.println("x=" + x + " : " + "y=" + y);


        int num = 10;
        while (num > 10) {
            num--;
        }

        do {
            num--;
            //num = 9
            while (num > 5) {
                num -= 2;
                //1. iteration 9 -2 = 7
                //2. iteration 7 -2 = 5
            }

        } while (num > 10); // 5 is < 10 the loop terminate

        System.out.println("num=" + num);
    }
}
