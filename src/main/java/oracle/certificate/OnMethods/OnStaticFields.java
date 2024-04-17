/**
 * Created by:AIDA
 * Date : 4/12/2024
 * Time : 9:30 AM
 */
package oracle.certificate.OnMethods;

public class OnStaticFields {

    static int xle  = 5;
    static String model0 = "SUV...........";
    static String model1 = "WAGONE...........";
    static String model2 = "TRUCK...........";
    static String model3 = "MINI...........";
    static String model4 = "COUPE...........";
    static String model5 = "BUS...........";
    public static void Car(){

        switch (xle){
            case 0 :
                System.out.println(model0);
                break;
            case 1:
                System.out.println(model1);
                break;
            case 2 :
                System.out.println(model2);
                break;
            case 3 :
                System.out.println(model3);
                break;
            case 4 :
                System.out.println(model4);
                break;
            default:
                System.out.println(model5);
            }
        }

        int x = 1;
    static int y = 1;
    static String name = "Jack";

    public static int cnt = 0;
    public static int increment() {
       return  ++cnt;
    }
    public static void main(String[] args) {
        OnStaticFields field = new OnStaticFields();

        System.out.println(field.x);

        System.out.println(field.name.toUpperCase().toLowerCase()); // accessed via instance reference
        System.out.println(field.y); //accessed via instance reference
        //Car();
    }
}
