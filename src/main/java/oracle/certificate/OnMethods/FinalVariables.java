/**
 * Created by:wondafrash
 * Date : 4/15/2024
 * Time : 9:24 AM
 */
package oracle.certificate.OnMethods;

import java.util.ArrayList;
import java.util.List;

public class FinalVariables {
    private static final int SIZE = 5;

    //private static  int SIZE = 5;

    private static final List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = new int[SIZE];

        //int x = SIZE + 1; // changing the value of the SIZE --> ArrayIndexOutOfBoundsException bc [i < SIZE]
        //SIZE = SIZE + 1; //-- > compilation error Cannot assign a value to final variable 'SIZE'
        long LONG = SIZE * 2;

        for(int i = 0; i < SIZE; i++){
            System.out.println(arr[i]);
        }

        list.add("A"); // we can add values to arrayList but can't change [[ new list = ArrayList();]] can't reassign
        list.add("B");
       // list.add("UPDATED....");
        list.add("B");
        list.add("K");
        list.remove(3);
        //int size0 = list.size();
        System.out.println("size="+list);

    }
}
