/**
 * Created by:AIDA
 * Date : 4/22/2024
 * Time : 12:55 PM
 */
package oracle.certificate.ClassDesigns.abstracts.AbstractMethod;

public class MainClass {
    public static void main(String[] args) {
        Wagon wagon = new Wagon();
        wagon.run();
        System.out.println(wagon.getVIN());
        wagon.drive();
        //wagon.

        Vehicles vehicles = new Wagon();
        vehicles.printDetails();
        //vehicles.

    }

}
