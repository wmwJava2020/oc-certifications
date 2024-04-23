/**
 * Created by:AIDA
 * Date : 4/23/2024
 * Time : 8:21 AM
 */
package oracle.certificate.ClassDesigns.interfaces.interface2;

interface Collage{
    int x = 0;
    String name = "Jack";
     static void getName(){
        System.out.println("getName... Collage");
    }


}
interface Campus{
    int x = 0;
    String name = "Jack";
    static void getName(){
        System.out.println("getName... Campus");
    }
}
interface Tech{
    default void getData(){
        System.out.println("Default....");
    }
}

// calling static and default method in interfaces
public class MainClass implements Campus,Collage,Tech{
    public static void main(String[] args) {
        MainClass class1 = new MainClass();
        class1.getInterfaces();

    }
    void getInterfaces(){
        Campus.getName();
        Collage.getName();
        Tech.super.getData();
    }


}
