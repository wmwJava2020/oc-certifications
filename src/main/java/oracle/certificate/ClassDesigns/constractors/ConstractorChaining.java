/**
 * Created by:Wondafrash
 * Date : 4/16/2024
 * Time : 9:02 AM
 */
package oracle.certificate.ClassDesigns.constractors;

import oracle.certificate.ClassDesigns.OnSuper.Plane;

public class ConstractorChaining {
    public static void main(String[] args) {
        Plane plane0 = new Plane("ADD","ETH");
        Plane plane1 = new Plane("ADD", 890,562354D);
        Plane plane2 = new Plane("USA",723.450F);
        Plane plane3 = new Plane("USA",890,723.450F,"ETH",562354D);
        plane0.print();
        // It is a common technique to help one constructor do the whole job or work of initializing variables
        // while other constructors just call other constructors, and they get to the last constructor which does
        // everything for us.
    }
}
