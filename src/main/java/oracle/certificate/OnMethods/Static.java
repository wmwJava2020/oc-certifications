/**
 * Created by:Wondafrash
 * Date : 4/15/2024
 * Time : 8:14 AM
 */
package oracle.certificate.OnMethods;

public class Static {
    static String Static = "Name";
    int Method = 0;
    public static void one(){
        System.out.println("1");
    }
    public static void two(){
        System.out.println("2");
    }
    public static void three(){
        System.out.println("3");
    }

    public static void four(){
        one();
        two();
        three();
        // five(); < --  Non-static method 'five()' cannot be referenced from a static context
        // System.out.println(Method); // < --  Non-static method 'five()' cannot be referenced from a static context
    }
    public void five(){
        three();
        two();
        one();
        System.out.println(Static);
    }
    public static void main(String[] args) {
        four();
        Static ss = new Static();
        new Static().five();
        //ss.five();
        //System.out.println(ss.Method);
    }
}
