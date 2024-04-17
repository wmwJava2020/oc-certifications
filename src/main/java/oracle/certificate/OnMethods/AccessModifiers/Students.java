/**
 * Created by:Wondafrash
 * Date : 4/11/2024
 * Time : 5:02 PM
 */
package oracle.certificate.OnMethods.AccessModifiers;

public class Students {

    public String PublicName = "Wondafrash-public";
    private String PrivateName = "Wondafrash-private";
    protected  int ProtectedData = 10;
    int defaultData = 10;


    public void PublidMethod() {
        System.out.println("Public...to the world");
    }

    protected void ProtectedM() {
        System.out.println("Protected...to the packages and sub-class");
    }

    private void privateM() {
        System.out.println("Private... to the class ");
    }

    void voidM(){
        System.out.println("Default/private... to package");
    }

    public static void main(String[] args) {
        Students stu = new Students();
        stu.privateM();
        stu.PublidMethod();
        stu.ProtectedM();
        stu.voidM();

        System.out.println(stu.ProtectedData);
        System.out.println(stu.PublicName);
        System.out.println(stu.PrivateName);
        System.out.println(stu.defaultData);
    }
}
