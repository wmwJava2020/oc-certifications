/**
 * Created by:wondafrash
 * Date : 4/9/2024
 * Time : 3:15 PM
 */
package oracle.certificate.OnArrayList;

import java.util.ArrayList;
import java.util.List;

public class UsingWrapperInArrayList {
    public static void main(String[] args) {

        List<Integer> i = new ArrayList<>();
        i.add(0,1);
        i.add(1,2);
        i.add(2,3);
        i.add(3,null);


        System.out.println(i);
       // int num = i.get(0); //primitive can't hold null, << NULL_POINTER_EXCEPTIONS >>
       // System.out.println(num);
        int num0 = i.remove(2); // this will remove element at index '2' which having value '3'
        System.out.println(num0);
        i.remove(new Integer(2)); // this one removes elements having value '2'
        System.out.println(i);

    }

}
