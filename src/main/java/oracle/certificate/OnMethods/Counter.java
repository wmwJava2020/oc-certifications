/**
 * Created by:wondafrash
 * Date : 4/12/2024
 * Time : 11:48 AM
 */
package oracle.certificate.OnMethods;
public class Counter {
    public static int count; // count is a variable
    public int count0;
    public Counter(){
        count++; // counter which increases the value
        count0++;
    }
    public static void main(String[] args) {
        Counter cnt0 = new Counter();
        Counter cnt1 = new Counter();
        Counter cnt2 = new Counter();
        Counter cnt3 = new Counter();

        System.out.println(count); //=0 have to call count++
        System.out.println(cnt0.count); //=1 // static value are shared among static objects
        System.out.println(cnt1.count); //=2
        System.out.println(cnt2.count); //=3
        System.out.println(cnt3.count); //=4
        System.out.println();
        count++; //5
        System.out.println(cnt0.count); //=5
        System.out.println(cnt1.count); //=5
        System.out.println(cnt2.count); //=5
        System.out.println(cnt3.count); //=5
        System.out.println();

        System.out.println(cnt0.count0);//1 instance variables can't be share across another instance
        System.out.println(cnt1.count0);//1
        System.out.println(cnt2.count0);//1
        System.out.println(cnt3.count0);//1
        System.out.println();
        cnt0.count0 =9; //setting new value
        cnt1.count0 =8;
        cnt2.count0 =7;
        cnt3.count0 =6;
        System.out.println(cnt0.count0); // = 9
        System.out.println(cnt1.count0); // = 8
        System.out.println(cnt2.count0); // = 7
        System.out.println(cnt3.count0); // = 6
    }
}
