/**
 * Created by:AIDA
 * Date : 4/12/2024
 * Time : 9:14 AM
 */
package oracle.certificate.OnMethods.AccessPackage;

import oracle.certificate.OnMethods.AccessModifiers.Students;

public class MySubClass extends Students {
    public static void main(String[] args) {
        Students stu = new Students();
        //stu.privateM();
        stu.PublidMethod();
        //stu.ProtectedM();
        //stu.voidM();

        //System.out.println(stu.ProtectedData);
        System.out.println(stu.PublicName);
        //System.out.println(stu.PrivateName);
        //System.out.println(stu.defaultData);
    }
}
