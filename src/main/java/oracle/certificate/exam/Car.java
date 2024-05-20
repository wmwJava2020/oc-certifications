/**
 * Created by:Wondafrash
 * Date : 5/20/2024
 * Time : 4:07 PM
 */
package oracle.certificate.exam;

public class Car {

    // Car car1 = new car() her car1 is a blueprint, not a real car, i.e., it is what a car does, and car able to do with its variable and methods.
    public static String engine; // should be static bc every Car has Engine, and this could be shared across the class

    public static boolean hasBreak; //
    public int enginSize; // non-static bc will apply to individual Car objects/every car has different enginSize;

    public String color;// non-static bc will apply to individual Car objects/every car has different color;

    public static void hasEngine(){ // all cars has an engine....
        System.out.println("Car hasEngine.....");
    }
    public void running(){ // Not all car runs
        System.out.println("Start engine.....");
    }

    public Car() {
        System.out.println("a");
    }
    public void Car() {
        System.out.println("b");
    }
    public void run(){
        new Car();
        Car();
    }
    public static void hasBreak(){ // all cars has an engine....
        System.out.println("Car hasEngine.....");

    }

}
