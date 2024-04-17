/**
 * Created by:AIDA
 * Date : 4/11/2024
 * Time : 5:07 PM
 */
package oracle.certificate.OnMethods.AccessModifiers;

public class OtherStudent {
    public static void main(String[] args) {
        Students stu= new Students();
        stu.voidM();
        stu.ProtectedM();
        stu.voidM();
        stu.PublidMethod();
        System.out.println(stu.ProtectedData);
        System.out.println(stu.PublicName);
        //System.out.println(stu.PrivateName);
        System.out.println(stu.defaultData);

    }

}
