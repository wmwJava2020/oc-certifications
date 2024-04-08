/**
 * Created by:Wondafrash
 * Date : 4/8/2024
 * Time : 4:17 PM
 */
package oc101.OnArrays;

import java.util.Arrays;

public class SearchingArrays {
    public static void main(String[] args) {
        int[] arr = {4,6,8,1,3,9,2,7,5,0};
        Arrays.sort(arr); // if this line is missing, it would be unpredictable (-6), to invoke binarySearch() array need to be sorted!
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr, 0));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 6));
        System.out.println(Arrays.binarySearch(arr, 9));
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 5));

    }
}
