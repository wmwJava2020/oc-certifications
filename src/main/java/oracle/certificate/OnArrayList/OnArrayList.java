/**
 * Created by:Wondafrash
 * Date : 4/9/2024
 * Time : 1:00 PM
 */
package oracle.certificate.OnArrayList;

import java.util.ArrayList;
import java.util.List;

public class OnArrayList {
    public static void main(String[] args) {

        //List list = new ArrayList<>();
        List<Object> list = new ArrayList<>(); //the same as above
        list.add("A");
        list.add(7);
        list.add('d');
        System.out.println("Objects = "+list);

        List<String> ls0 = new ArrayList<>();
        ls0.add("K");
        ls0.add(1,"Car");
        ls0.add("1");
        ls0.add("10");
        ls0.add("James");
        ls0.add(4,"Car");
        ls0.add("8");
        ls0.add(String.valueOf(6));
        System.out.println("Strings = "+ls0);

        List<Integer> ls = new ArrayList<>();
        ls.add(9);
        ls.add(Integer.valueOf("5"));
        ls.add(5*6);
        ls.add((int) 'a');
        ls.add(3,9);
        ls.set(4,99);
        System.out.println("Integers= "+ls);


    }
}
