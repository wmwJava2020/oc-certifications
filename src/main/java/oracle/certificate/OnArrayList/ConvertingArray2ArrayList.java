/**
 * Created by :wondafrash
 * Date : 4/9/2024
 * Time : 3:40 PM
 */
package oracle.certificate.OnArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArray2ArrayList {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("James");
        name.add("Mark");
        name.add("Will");
        name.add("Alexi");
       // System.out.println(name);

        Object[] objects = name.toArray();
        for(String names : name){
            System.out.print(names+" ");
        }
        System.out.println();

        List<String> arr0 = Arrays.asList("cat","Bat","Dog"); // asList() - provides a convenient way to create a fixed-size list.
        arr0.set(2,"DiDo"); // we can change/update the elements, but we can't add or remove

        System.out.println(arr0);

        String[] sList = {"a","b","c","d"};


        List<String> cList = Arrays.asList(sList); // asList -> Returns a fixed-size list backed by the specified array.
       // cList.add("ABA");
        int size = cList.size();
        System.out.println("size="+size);

        cList.set(1,"B"); // will modify both cList and sList objects
        System.out.println(Arrays.toString(sList));
        System.out.println(cList);

    }
}
