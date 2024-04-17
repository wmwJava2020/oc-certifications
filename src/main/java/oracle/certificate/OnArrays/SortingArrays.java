/**
 * Created by:Wondafrash
 * Date : 4/8/2024
 * Time : 3:47 PM
 */
package oracle.certificate.OnArrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        String[] str = {"Orange", "Apple", "Papaya", "Banana", "Strawberry"};
        Arrays.sort(str);
        for (String st : str) {
            System.out.print(st +" ");
        }
        System.out.println();
        int[] arr = {4,6,8,1,3,9,7,2,5};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length ; i++){
            System.out.println("arr[" + i + "] = " +arr[i]);
        }
        String[] s1 = {"90","10","44","20","600","300","5000"};
        Arrays.sort(s1);
        System.out.println(Arrays.toString(s1)); // [10, 20, 300, 44, 5000, 600, 90] bc String sorted based on the first alphabet, so 300 - 3 - i before 90 - 9 -

    }
}
