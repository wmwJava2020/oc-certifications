/**
 * Created by:Wondafrash
 * Date : 4/16/2024
 * Time : 9:05 AM
 */
package oracle.certificate.ClassDesigns.OnSuper;

public class Plane {
    private String destin;
    private String Owner;
    private int miles;
    private double amount;
    private float enginVolume;
    public Plane(String destin,String Owner){
        //this.destin = destin;
        //this.Owner = Owner;
        this("AA",9080,7809D); // Call to 'this()' must be the first statement in constructor body
        this.destin = destin;
        this.Owner = Owner;
        System.out.println("Constractors Plane0");
    }

    public Plane(String destin,int miles,double amount){
        this("ADD",908.7f);
        this.destin = destin;
        this.miles = miles;
        this.amount = amount;
        System.out.println("Constractors Plane1");
    }
    public Plane(String destin,float enginVolume){
        this("ADD",3652,4563.76f,"ETH",8797D);
        this.destin = destin;
        this.enginVolume = enginVolume;
        System.out.println("Constractors Plane2");
    }
    public Plane(String destin,int miles,float enginVolume,String Owner,double amount){
        this.destin = destin;
        this.miles = miles;
        this.Owner = Owner;
        this.enginVolume = enginVolume;
        this.amount = amount;

    }

    public void print(){
        System.out.println("Destin="+this.destin +" Miles= "+ this.miles +" Volume= "+this.enginVolume +" Owner="+this.Owner +" Amount= "+ this.amount);
    }


}
