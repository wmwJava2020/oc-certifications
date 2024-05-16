/**
 * Created by:AIDA
 * Date : 4/11/2024
 * Time : 5:09 PM
 */
package oracle.certificate.OnMethods.AccessPackage;

import oracle.certificate.OnMethods.AccessModifiers.Students;

public class TestStudents {

    public static void main(String[] args) {
        Students stu = new Students();
        //System.out.println(stu.ProtectedData);
        System.out.println(stu.PublicName);
        //System.out.println(stu.PrivateName);
        //System.out.println(stu.defaultX);
    }
}
