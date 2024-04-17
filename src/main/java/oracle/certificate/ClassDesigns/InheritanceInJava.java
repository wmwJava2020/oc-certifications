/**
 * Created by:Wondafrash
 * Date : 4/16/2024
 * Time : 2:20 PM
 */
package oracle.certificate.ClassDesigns;

class Vehicles {
    /*private int mile;
    public Vehicles() {
        super();
        System.out.println("form Vehicle class");
        //this.mile = mile;
    }*/

}
class Bus extends Wagon{
    Bus(){
        super();
        System.out.println("from Bus class");
    }
}

class SUV extends Vehicles {
    /*public SUV() {
        super();
        System.out.println("from SUV class");
    }*/
    public int Vehicles(int x){
        return x;
    }
}

class Wagon extends SUV {
    /*public Wagon() {
        //super();
        System.out.println("from Wagon class");
    }*/
}

public class InheritanceInJava {
    public static void main(String[] args) {
        Wagon wagon = new Wagon();

    }
}
