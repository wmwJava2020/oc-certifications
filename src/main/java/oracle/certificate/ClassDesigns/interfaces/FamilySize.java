/**
 * Created by:AIDA
 * Date : 4/22/2024
 * Time : 1:47 PM
 */
package oracle.certificate.ClassDesigns.interfaces;

public class FamilySize extends House implements NBE,SunShine{
    public FamilySize(double amount, int age, String model) {
        super(amount, age, model);
    }

    public FamilySize() {
        super();
    }

    @Override
    public void printDetails() {
        System.out.println("from house... extending...");
    }

    @Override
    public void businessRate() {
        System.out.println("from NBE .. implementing.. ");
    }

    @Override
    public float vehicleRate() {
        System.out.println("from NBE .. implementing.. ");
        return (float) (rate * .0898);
    }

    @Override
    public float homeRate() {
        System.out.println("from NBE .. implementing.. ");
        return (float) (rate * .123 / 6);
    }

    @Override
    public void construcHome() {
        System.out.println("from Sun-Shine-Constructions....");
    }
}
