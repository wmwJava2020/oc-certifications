/**
 * Created by:AIDA
 * Date : 3/28/2024
 * Time : 1:40 PM
 */
package oc101.operators;

public class OperatorsExercise {
    public static void main(String[] args) {
        //byte x = 5;
       // byte y = 4;
        //double c = x + y; //int,long and double could be types for the solutions

        //short a = 10; //bc short could be promoted to int ; casting to int ;
        long a = 10;
       // int b = 4 * a; // change this data types to long or promoting

        boolean x = true, z=true;
        int y = 20;
        x=(y!=10) ^(z=false);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        int j = 7;
        int k = 4;
        System.out.println( k+=++j);// k = k + 1 k = 4 + 1, k=5 j = j + 1 j = 1 + 7 =8 k =+8

    }
}
