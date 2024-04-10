/**
 * Created by:wondafrash
 * Date : 4/10/2024
 * Time : 8:48 AM
 */
package oracle.certificate.OnArrayList;

import java.util.*;

public class IteratingList {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(8);
        ls.add(2);
        ls.add(4);
        ls.add(9);
        ls.add(6);

        ls.clear();
        System.out.println("----"+ls);

        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i)+" ");
            //ls.remove(3); // for each-loop ; IndexOutOfBoundsException we can't iterate and remove elements at the same time
            //System.out.println();
        }
        //System.out.println();
        for (Integer it : ls) {
            //System.out.print(it+" ");
           // ls.remove(3); // for-loop :  ConcurrentModificationException we can't iterate and remove elements at the same time
            //System.out.println();
        }
        System.out.println();
        for(Iterator iterator = ls.iterator(); iterator.hasNext();){
            Integer num = (Integer) iterator.next();
            System.out.println(num);
            iterator.remove();
        }
        //System.out.println(ls);

        ls.addAll(Arrays.asList(23,45,67,98,12,34,69,4,0,1));
        System.out.println("post "+ls);

        //listIterator.hasPrevious();)  Returns true if this list iterator has more elements when traversing the list in the reverse direction.
        for(ListIterator listIterator = ls.listIterator(4); listIterator.hasPrevious();){

            //istIterator.previous()  Returns the previous element in the list from specified index position
            System.out.println(listIterator.previous());

            listIterator.remove(); // return 23, 45, 67

        }

    }

}
