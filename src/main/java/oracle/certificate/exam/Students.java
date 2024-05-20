/**
 * Created by:Wondafrash
 * Date : 5/16/2024
 * Time : 8:29 PM
 */
package oracle.certificate.exam;

public class Students {

    private static String sName; // class variable, belongs to a class, same across all class
    private static String cName;
    private String campus = null;
    private float gpa; // instance variable, belongs to INSTANCE of a class, can different for different instance, only accessed by NON-STATIC methods
    private int age;

    public static String getsName() {
        return sName;
    }

    public static void setsName(String sName) {
        Students.sName = sName;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
