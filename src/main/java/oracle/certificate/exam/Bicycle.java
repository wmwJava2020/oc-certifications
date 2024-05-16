/**
 * Created by:AIDA
 * Date : 5/16/2024
 * Time : 9:29 AM
 */
package oracle.certificate.exam;

public class Bicycle {

    String color ="RED";
    // Java uses pass by value. This means that when a method is called,
    // the method parameter values are copied to another variable and then the copied object is passed to the method.
    private void printColor(String color){
        color = "PURPLE";
        System.out.println(color);
    }

    String A$B;

    static String _name;
    static float $_name;
    static boolean Public;
    static boolean Publics;

    String abs_19;
   public void tesing(){
       int x = 0b101;
       int a = 0xE;
       int b = 0b101;
       int xe = 1_1_1;
       double xs = 1_0.0_9;
       float y;
       boolean r;
       System.out.println(_name);
       System.out.println(x);
       //System.out.println(r);
   }
    public static boolean heat = true;
   int a = Integer.valueOf("1");
    public static void main(String[] args) {

        boolean heat = false;
        System.out.println(heat);
        new Bicycle().printColor("BROWN");
        System.out.println(Public==Publics);

        int a = Integer.valueOf("2");
        int b = Integer.valueOf("3");
        System.out.println(a + b);

       // if two data types are different, java will promote it to a larger data type.
        float FLOAT = 4f;
        double DOUBLE = 2d;

        double fl = FLOAT + DOUBLE;
        System.out.println("float + double = "+fl);

    }


}
