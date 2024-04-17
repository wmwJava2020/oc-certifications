/**
 * Created by:wondafrash
 * Date : 4/9/2024
 * Time : 1:38 PM
 */
package oracle.certificate.OnArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

    // isEmpty() contains() size(),clear() and equals()

    public static void main(String[] args) {

        List<String> ls = new ArrayList();
        //System.out.println(ls.isEmpty());
        //System.out.println(ls.size());
        ls.add(0,"Jack");
        //System.out.println(ls.isEmpty());
        //System.out.println(ls.size());
        ls.add(1,"Mack");
        //System.out.println(ls.isEmpty());
        //System.out.println(ls.size());

        List<String> l1 = new ArrayList<>();
        l1.add("Mack");
        l1.add("Zack");
        List<String> l2 = new ArrayList<>();
        l2.add("Zack");
        l2.add("Mack");
        System.out.println("l1 = "+l1);
        System.out.println("l2 = "+l2);
        System.out.println("[==]"+(l1 == l2));
        //the size and elements are equals but order is not
        System.out.println("[equals]="+l1.equals(l2));// two lists are defined to be equal if they contain the same elements in the same order
    }
}