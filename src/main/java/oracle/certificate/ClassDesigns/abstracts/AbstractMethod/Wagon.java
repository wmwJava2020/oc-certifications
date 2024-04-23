/**
 * Created by:AIDA
 * Date : 4/22/2024
 * Time : 12:44 PM
 */
package oracle.certificate.ClassDesigns.abstracts.AbstractMethod;

public class Wagon extends Vehicles{
    @Override
    public void run() {
        System.out.println("Wagon class run()..");
    }

    @Override
    public void drive() {
        System.out.println("Wagon class drive()..");
    }

    @Override
    public String getVIN() {
        return "Wagon class VIN-0123...";
    }
    public void printName(){
        System.out.println("Wagon class... impl");
    }
}
