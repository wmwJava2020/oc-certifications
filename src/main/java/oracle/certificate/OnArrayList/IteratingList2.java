/**
 * Created by:wondafrash
 * Date : 4/10/2024
 * Time : 9:45 AM
 */
package oracle.certificate.OnArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(createData());

        long start = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
        }

        long total = start - System.currentTimeMillis();
        System.out.println("For_Loop_Total_TIME : " + total + " ms");

        //FOR-EACH-LOOP
        start = System.currentTimeMillis();
        for (String temp : list) {

        }

        total = start - System.currentTimeMillis();
        System.out.println("FOR_EACH_LOOP_TIME :  " + total + " ms");

        //FOR_ITERATOR
        start = System.currentTimeMillis();

        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            String temp = (String) iterator.next();
        }

        total = start - System.currentTimeMillis();
        System.out.println("ITERATOR_TIME    :    " + total + " ms");

        //LIST_ITERATOR_SCENARIO
        start = System.currentTimeMillis();

        for (ListIterator listIterator = list.listIterator(); listIterator.hasPrevious(); ) {
            listIterator.hasPrevious();
        }

        total = start - System.currentTimeMillis();
        System.out.println("LIST_ITERATOR_TIME :   "  + total + "  ms");

    }

    private static String[] createData() {
        String[] arr = new String[10_000_000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "Array" + i;
        }
        return arr;
    }
}
