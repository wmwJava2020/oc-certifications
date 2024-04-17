/**
 * Created by:AIDA
 * Date : 4/16/2024
 * Time : 10:43 AM
 */
package oracle.certificate.ClassDesigns;

class Person {
    public int count = 0;

    {
        System.out.println("2, 1st Inst= " + count);
    }

    public static String name;

    static {
        name = " Mark";
        System.out.println("1, static =" + name);
    }

    {
        count += 10;
        System.out.println("3, 2nd Inst = " + count);
    }

    public Person() {
        System.out.println("4, Finally.. Constructor....");
    }


}

class Students {

    static {
        add(2);
    }

    public static void add(int num) {
        System.out.print(num + " ");
    }

    Students() {
        add(5); // last constructor call prints 3rd
    }

    static {
        add(4);
    }

    {
        add(6); // last constructor call prints 1st
    }

    static {
        new Students(); // Student class object contractor is done here at first.
    }

    {
        add(3); // last constructor call prints 2nd
    }
}

class MathsTest {
    final static String data;
    //private int month = 01;

    static {
        data = "September_is  ";
    }

    {
        System.out.print(data + " ");
    }

    public static void match() {
        System.out.print(data + " ");
    }

    {

        String data = "New-YEAR";
        System.out.print(data + " ");

    }

    {
        String data = "Ethiopian";
        System.out.print(data + " ");
    }

}

public class OrderOfIntializations {
    public static void main(String[] args) {
        //new Person();
        //new Students(); // this call creates the last 6,3,5
        MathsTest test = new MathsTest();
        test.match();

    }
}
