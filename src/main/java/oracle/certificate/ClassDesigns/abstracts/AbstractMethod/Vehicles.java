/**
 * Created by:AIDA
 * Date : 4/22/2024
 * Time : 12:40 PM
 */
package oracle.certificate.ClassDesigns.abstracts.AbstractMethod;

public abstract class Vehicles {

    private String modle;
    private int wheel;

    public Vehicles(){}

    public void dirve(){

    }

    // public static abstract void run(); '

    public abstract void run();

    public abstract void drive();

    public abstract String getVIN();
    public void printName(){
        System.out.println("Honda Pilot");
    }
    public void printDetails(){
        printName();
        System.out.println("Print-Details-method...");
    }
}
