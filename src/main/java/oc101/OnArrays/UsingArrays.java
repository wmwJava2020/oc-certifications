/**
 * Created by:Wondafrash
 * Date : 4/8/2024
 * Time : 8:56 AM
 */
package oc101.OnArrays;

import java.util.Arrays;

public class UsingArrays {
    public static void main(String[] args) {
        String[] letters = {"@", "#", "&","%"};
        System.out.println(letters[0]);
        System.out.println(letters[1]);
        System.out.println(letters[2]);
        System.out.println(letters[3]);
        // System.out.println(letters[4]); //throws arrayIndexOutOfBound

        letters[0] = "X"; //at index '0', @ will be replaced with 'X'

        // print using iterations
        for(int i = 0 ; i < letters.length ; i++){
           // System.out.println(letters[i]+" ");
        }

        // we have to use length - 1 otherwise it will be ArraysOutOfBoundExceptions
        for(int i = 0 ; i <= letters.length -1 ; i++){
            System.out.print(letters[i]+",");
        }
        System.out.println();
        System.out.println(letters); // will print memory locations of the elemetns
        System.out.println(Arrays.toString(letters));

        int[] num = new int [5];

        String[] s1 = new String[5];

        for(int i = 0; i <= num.length - 1; i++){
            num[i] = i + 5;
            //itr -1 , index = 0 , i = i + 5 == 0 + 5 the value of 'i' would be 5
            //itr -2 , index = 1 , i = i + 5 == 1 + 5 the value of 'i' would be 6

        }
        //System.out.println(Arrays.toString(num));
        for(int i = 0; i < num.length;i++){
           // System.out.println("num at index " + "[" + i + "] = " + num[i]);
        }

        for(int i = 0;i < num.length;i++){
            num[i] = i % 3;
            // i = 0 == 0 % 3 == 0
            // i = 1 == 1 % 3 == 1
            // i = 2 == 2 % 3 == 2
            // i = 3 == 3 % 3 == 0
            // i = 4 == 4 % 3 == 1
            //System.out.println(num[i]);
        }
        System.out.println();
        for(int i = 0; i < num.length;i++){
            num[i] = i + 2 * 1 + 4 / - 4 ;
            // i  = 0   == 2 * 3 + 4 / 3 - 2;
            // i =  0 == 6 + 4/3 - 2
            System.out.println(num[i]);

        }

    }
}
