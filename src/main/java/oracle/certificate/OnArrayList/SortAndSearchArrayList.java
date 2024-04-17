/**
 * Created by:Wondafrash
 * Date : 4/9/2024
 * Time : 4:16 PM
 */
package oracle.certificate.OnArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndSearchArrayList {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("40");
        ls.add("9");
        ls.add("300");
        ls.add("10");
        ls.add("500");
        ls.add("80");

        System.out.println(ls);
        Collections.sort(ls);
        for(String str : ls){
            System.out.print(str+",");
        }
        System.out.println();

        List<Integer> ls1 = Arrays.asList(9,0,2,4,1,6,3,5);
        Collections.sort(ls1);
        System.out.println(ls1);

        System.out.println("=================");
        //searching...........List

        List<String> l = new ArrayList<>();
        l.add("40");
        l.add("9");
        l.add("300");
        l.add("20");
        l.add("5");
        l.add("600");
        l.add("80");
        l.add("1");

        System.out.println("unsorted: "+l); // if list not sorted the result would be undefined
        Collections.sort(l); //NB: if the list is not sorted, we will get -1
        System.out.println("Sorted  : "+l);
        int index = Collections.binarySearch(l,"80");
        System.out.println("Element '80' at index = "+index);

        System.out.println();

        List<Integer> l1 = Arrays.asList(9,0,2,4,1,6,3,5,7);
        int index0 = Collections.binarySearch(l1,6);
        System.out.println("before sort : "+index0);


        Collections.sort(l1); // after sorted
        System.out.println(l1);

        int index1 = Collections.binarySearch(l1,6);
        System.out.println("after sort  : "+index1);
    }
}
