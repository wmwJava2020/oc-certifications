/**
 * Created by:Wondafrash
 * Date : 4/22/2024
 * Time : 1:44 PM
 */
package oracle.certificate.ClassDesigns.interfaces;

public abstract class House {

    public double amount;
    public int age;
    public String model;

    public House() {

    }

    public abstract void printDetails();
    public void PrintDetails(){
        System.out.println("print-details : "+getAge()+":" + getAmount()+":" + getModel());
    };

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public House(double amount, int age, String model) {
        this.amount = amount;
        this.age = age;
        setModel("Old-Models");
    }
}
