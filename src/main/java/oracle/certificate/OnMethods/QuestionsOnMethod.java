/**
 * Created by:AIDA
 * Date : 4/15/2024
 * Time : 3:28 PM
 */
package oracle.certificate.OnMethods;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class QuestionsOnMethod {
    public static void main(String[] args) {
        int value = 9;
        long rs = squer(value);
        System.out.println(value);
        int r =9;
        int q =- 1;
        System.out.println("q="+q);
    }

    public static long squer(int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }

    public void method1() {
        return;
    } //void method is allowed to have a return statement as long as it doesn't return any value.

    public void method2() {
    } //void method is allowed to have a return statement as long as it doesn't return any value.

    public int method() {
        return 9;
    }

    List<String> list = new ArrayList<>();

    void name() {
        sort(list);

    }
}
