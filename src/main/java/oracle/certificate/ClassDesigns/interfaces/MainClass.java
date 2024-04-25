/**
 * Created by:Wondafrash
 * Date : 4/22/2024
 * Time : 1:50 PM
 */
package oracle.certificate.ClassDesigns.interfaces;

public class MainClass {

    public static void main(String[] args) {
        FamilySize size = new FamilySize();
        size.setAge(25);
        int age = size.getAge();
        System.out.println(age);
        size.businessRate();
        float homeRate = size.homeRate();
        System.out.println("home-rate    : "+homeRate);
        float v = size.vehicleRate();
        System.out.println("vehicle-rate :"+v);
        size.printDetails();
        size.PrintDetails();
        size.construcHome();
    }
}
