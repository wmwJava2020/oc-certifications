/**
 * Created by:Wondafrash
 * Date : 5/16/2024
 * Time : 4:14 PM
 */
package oracle.certificate.exam;

public class JavaClass {

    int x =+5;
    static {
        System.out.println("static");
    }

      // An instance initializer block is a block of code that is executed whenever an object of a class is created.
     // It is used to initialize the instance variables of the class.
    // Instance initializer blocks are declared inside the class body, but outside of any method or constructor.

    String _name;

    {
        System.out.println( x +" init... 1");
        // An instance initializer block is a block of code that is executed whenever an object of a class is created.
        // It is used to initialize the instance variables of the class.
    }


    public static void main(String[] args) {
        JavaClass c = new JavaClass();

        String STRING = "String";
        int _abc = 4;

        //System.out.println(_abc +" "+ STRING);
        System.out.println(c.x);
    }

    {
        System.out.println(x +" init... 2");
        // An instance initializer block is a block of code that is executed whenever an object of a class is created.
        // It is used to initialize the instance variables of the class.
    }
}
