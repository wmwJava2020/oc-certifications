/**
 * Created by:AIDA
 * Date : 4/15/2024
 * Time : 4:16 PM
 */
package oracle.certificate.OnMethods;

public class Rope {

    public static void swing(){
        System.out.println("swing");
    }
    public void climb(){
        System.out.println("climb");
    }
    public static void play(){
        swing();
        //climb();
    }
    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope1 = null;
        rope1.play();// even if its null, we can still invoke static

    }
}
