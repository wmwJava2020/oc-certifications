/**
 * Created by:AIDA
 * Date : 4/17/2024
 * Time : 10:27 AM
 */
package oracle.certificate.methodOverride;

public class Campus extends Collage {
    public Campus(int grade, String course) {
        super(grade, course);
        System.out.println("Campus...");
    }


    @Override
    public int getYear(int year) {
        int x = 2020;
        return super.getYear(x);
    }
}
