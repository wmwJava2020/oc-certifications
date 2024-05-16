/**
 * Created by:AIDA
 * Date : 4/17/2024
 * Time : 12:40 PM
 */
package oracle.certificate.ClassDesigns.abstracts;

public abstract class Campus extends StudentAbstract{

    private String address;
    private final String name = "AAU";

    public void printData(){
        System.out.println("Campus");
    }

    public abstract void getWeekEnd();

}
