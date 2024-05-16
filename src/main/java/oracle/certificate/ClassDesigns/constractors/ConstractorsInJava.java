/**
 * Created by:Wondafrash
 * Date : 4/16/2024
 * Time : 8:17 AM
 */
package oracle.certificate.ClassDesigns.constractors;


class Vehicle {
    private String model;
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public void printModel(){
        System.out.println(this.model = model);
    }
}

class Honda{
    private String engin;
    private String origin;
    private int valveNum;
    public Honda(String engin,String origin,int valveNum){
        this.engin = engin;
        this.origin = origin;
        this.valveNum = valveNum;
    }
    public Honda(String engin,String origin){ //constructor over loading
        this.engin = engin;
        this.origin = origin;
    }
    public Honda(String origin,int valveNum){ //constructor over loading
        this.origin = origin;
        this.valveNum = valveNum;
    }
    public Honda(String origin){ //constructor over loading
        this.origin = origin;
    }
    public String getEngine(){
        return engin;
    }
    public String getOrigin(){
        return origin;
    }
    public int getValveNum(){
        return valveNum;
    }
    public void setEngine(String engine){
        this.engin = engine;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }
    public void setValveNum(int valveNum){
        this.valveNum = valveNum;
    }

    public void printDetails(){
        System.out.println("EngineType="+engin + " :  MadeBy="+origin+ " :  ValveNumber="+valveNum);
    }

    public void printOriginEngine(){
        System.out.println("Origin="+this.origin + "  Engine="+this.engin);
    }
}

public class ConstractorsInJava {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Honda...");
        car.printModel();
        Honda honda = new Honda("V-Tech","Japan",6);
        honda.printDetails();
        honda.printOriginEngine();
    }
}
