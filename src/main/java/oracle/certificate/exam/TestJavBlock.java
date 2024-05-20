/**
 * Created by:Wondafrash
 * Date : 5/20/2024
 * Time : 2:51 PM
 */
package oracle.certificate.exam;

public class TestJavBlock {

    public static String first = "instance";

    public TestJavBlock(){
        first= "constructor";
    }

    public String addr;
    public String name = "Jack";
    static {
        first = "block";
    }

    public void print(){
        System.out.println(first);
        System.out.println(name);
    }


    public String getTest(){
        return name;
    }
    //double d = 2.7_9_2;
    //Integer INT = null;

    public void play(){
        System.out.print("Play-");
    }
    public void finalize(){ //  finalize is that it is invoked if and when the Java™ virtual machine has determined that there is
                           // no longer any means by which this object can be accessed by any thread that has not yet died,
        System.out.print("Clean");
    }
    public static void main(String[] args) {
        TestJavBlock t1 = new TestJavBlock();
        t1.play();
        System.gc();
        TestJavBlock t2 = new TestJavBlock();
        t2.play();


    }
}
