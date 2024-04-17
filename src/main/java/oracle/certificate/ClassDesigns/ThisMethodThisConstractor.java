/**
 * Created by:AIDA
 * Date : 4/16/2024
 * Time : 10:20 AM
 */
package oracle.certificate.ClassDesigns;

public class ThisMethodThisConstractor {

    private String fName;
    private String lName;
    private int age;
    private char gender;
    ThisMethodThisConstractor(){
        this("Jack ", "Mack");
    }

    public ThisMethodThisConstractor(String fName,String lName){
        this("Zack","Guyo",45,'M');
        this.fName = fName;
        this.lName = lName;
         // In the above case, if parameter was like ThisMethodThisConstructor(String name0, String name1),
        // THIS key word is optional if parameter doesn't have the same name as a field name;
    }

    public ThisMethodThisConstractor(String fName,String lName, int age, char gender) {
        this.lName = lName;
        this.fName = fName;
        this.age = age;
        this.gender = gender;
    }

    public void printMe0(){
        System.out.println(fName+"Guyatu "+lName+" Doyo ");
    }
    public void printMe(){
        System.out.println(fName+"Guyatu "+lName+" Doyo "+age+ 23 +gender+'F');
    }
    public static void main(String[] args) {
        ThisMethodThisConstractor cl = new ThisMethodThisConstractor();
        cl.printMe0();

    }
}
