/**
 * Created by:Wondafrash
 * Date : 4/17/2024
 * Time : 11:56 AM
 */
package oracle.certificate.ClassDesigns.abstracts;

public abstract class StudentAbstract {

    public String name;
    public String campus;
    abstract void getFile();
    abstract void get_Date();
    abstract void $address();

    public void _location(){
        System.out.println("getLocation");
    }
    public final void $getData(){
        System.out.println("getData");
    }
    public void print(){
        System.out.println("StudentAbstract");
    }
    abstract void $addressse();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public static void listName(){
        System.out.println("Static call form StudentAbstract class ");
    }

}
