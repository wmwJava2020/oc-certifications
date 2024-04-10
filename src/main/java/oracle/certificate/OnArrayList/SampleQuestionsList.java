/**
 * Created by:wondafrash
 * Date : 4/10/2024
 * Time : 10:28 AM
 */
package oracle.certificate.OnArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SampleQuestionsList {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        ls.add("One");
        ls.add("Two");

        //ls.clear();
        System.out.println("[]= "+ls);
        System.out.println(ls.contains(new String("Two")));
        System.out.println(ls.indexOf("Two"));




        ArrayList<String> l = new ArrayList<>();
        l.add("A");

        ArrayList<String> s = new ArrayList<>();
        s.add("A");
        //s.remove(0); // this will compile successfully, bc it doesn't know if arrays are out of bound or not but throw exception at run time
        System.out.println(l.equals(s)); // arrayList with the same content are equal
        System.out.println(l == s);


        List<Integer> list = Arrays.asList(10,-1,5,4);
        Collections.sort(list);
        Integer[] arr = list.toArray(new Integer[4]); // converting back to array having 4 elements
        System.out.println(arr[0]); // the least element is -1


    }
}
