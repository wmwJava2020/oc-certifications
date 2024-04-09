/**
 * Created by:AIDA
 * Date : 4/9/2024
 * Time : 9:05 AM
 */
package oc101.OnArrays;

public class NestedLoopArrays {
    public static void main(String[] args) {

        for (int hours = 1; hours < 2; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                for (int seconds = 0; seconds < 60; seconds++) {
                    //System.out.println("Local Time : "+hours +":"+minutes+"."+seconds);
                }
            }
        }

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //System.out.println(arr2);
        //System.out.println(Arrays.toString(arr2));

        // NestedLoop case for OUTER and INNER break
        OUTER:
        for (int[] myArr : arr2) {
            INNER:
            for (int i = 0; i < arr2.length; i++) {
                if (myArr[i] % 2 == 0) {
                    // break;
                    // break OUTER;
                    // break INNER; // 1st row
                    // continue OUTER; // rs "1, 7" exec 1st row skip '2' -, continue skip '4' - -, contiune '7' skip 8
                    continue INNER; // skip '2' and print 1 & 3, then skip 4 & 6  to print '5', finally prints 7 & 9
                }
               // System.out.print(myArr[i] + " ");
            }
            //System.out.println();
        }

        int x = 10;
        while (x > 0) {
            do {
                //1. exec as long as  x > 5

                x -= 1;
            } while (x > 5);
            x--;
            System.out.println("x="+x);
            //1.execute till -- x = 5;
            //2. x = 4
            //3. x = 2
            //4. x = 0


        }
        int q =1,r=1;
        System.out.println(q*r%2==0);
    }
}
