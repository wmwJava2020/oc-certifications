/**
 * Created by:Wondafrash
 * Date : 4/17/2024
 * Time : 11:37 AM
 */
package oracle.certificate.ClassDesigns.methodOverride2;

public class Eagle extends Bird{
    public int fly(int height){
        System.out.println("Eagle is flying at "+height);
        return height;
    }

    /*public void eat(int x){ //  we can 't change method signature while overriding
        return
    }*/

    @Override
    public double getLength(double l){
        return l*=4;
    }
}
