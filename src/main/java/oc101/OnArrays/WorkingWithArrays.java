/**
 * Created by:wondafrash
 * Date : 4/8/2024
 * Time : 8:14 AM
 */
package oc101.OnArrays;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] arr = new int[3]; // will give us array with three elements

        int[] arr1 = new int[] {2,4,5,6,7,8}; //array with length of 6 elements

        //double[] d1 = new double[23.5]; // doesn't compile'

        double [] d2 = new double []{4 * 4 / 8}; // will give us array with 2 elements

        int g = 5, h = 4;

        double [] d3 = new double[] {g * h}; // give us arrays having 20 elements;

        int[] k = {1,5,6,7,0};  // anonymous array i.e. arrays type not specified on the right side;

        int[] arr4;

        int arr5 [];

        int[] arr6, arr7;  // this creates two arrays

        int arr8[], arr9;  // bad practice this will create array of arr8 and int of arr9

        String[] s1 = {"A", "B", "C"};
        String[] s2 = s1;
        String[] s3 = {"A", "B", "C"};

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));  // referring to the same
        System.out.println(Arrays.equals(s1,s2)); // checking if each element is equals with other elements
        System.out.println("  ------------  ");
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // false both referring different
        System.out.println(Arrays.equals(s1, s3)); // checking if each element is equals with other elements

        //to print arrays
        System.out.println(s1); // will get arrays memory location -- > [Ljava.lang.String;@4554617c
        System.out.println(s1.toString());  // will get arrays memory address --> [Ljava.lang.String;@4554617c
        System.out.println(Arrays.toString(s1));  // will get -- > [A, B, C]




    }
}
