/**
 * Created by:Wondafrash
 * Date : 4/17/2024
 * Time : 11:35 AM
 */
package oracle.certificate.ClassDesigns.methodOverride2;

public abstract class Bird {

    public void fly() {
        System.out.println("birds are flying....");
    }

    public void heightLong(int heights, int width) {
        System.out.println("Bird has " + heights + width);
    }

    public void heightLong(int heights) {
        System.out.println("Bird has " + heights);
    }

    public void eat(int amt) {
        System.out.println("Birds eat " + amt + " of kilos");
    }

    public double getLength(double len) {
        return len *= 6;
    }

}
