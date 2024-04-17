/**
 * Created by:AIDA
 * Date : 4/17/2024
 * Time : 10:25 AM
 */
package oracle.certificate.methodOverride;

public class Teachers extends Students{

    public Teachers(int grade, String course) {
        super(grade, course);
        System.out.println("Teachers...");
    }
}
