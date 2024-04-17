/**
 * Created by:AIDA
 * Date : 4/17/2024
 * Time : 12:53 PM
 */
package oracle.certificate.ClassDesigns.abstracts;

public class MainClass {
    public static void main(String[] args) {
        StudentAbstract stu = new AbstractTest();// the abstractTest the implementing class of StudentAbstract-abstract class

        SocialSecince ssc = new SocialSecince();

        ssc.$address();
//        ssc.$getData();
        ssc.setName("TUTO");
        ssc.setCampus("EAST");
        System.out.println(ssc.campus);
        System.out.println(ssc.name);
        stu.setCampus("North");
        stu.setName("Kiya");
        String str = stu.getCampus();
        String str0 = stu.getName();
        System.out.println(str);
        System.out.println(str0);

    }
}
