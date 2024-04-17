/**
 * Created by:AIDA
 * Date : 4/16/2024
 * Time : 12:53 PM
 */
package oracle.certificate.ClassDesigns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class  Company{
    public static void main(String[] args) {
        DataEncapsulation data = new DataEncapsulation();
        data.setBusiness("JAMICA");
        data.setCompany("IL-TV-INC.");
        data.setActive(false);
        data.printSorted();
    }
}
public class DataEncapsulation {

    private String name;
    private List<String> employee = new ArrayList<>();
    private String business;

    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void addEmployee(String name){
        if(name == null || name.isEmpty()){
            System.out.println("Employee data can't be null");
        }else{
            employee.add(name);
        }
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    public List<String> getEmployee() {
        return employee;
    }
    public void setCompany(String name) {
        this.name = name;
    }
    public String getCompany() {
        return name;
    }
    public void setEmployee(List<String> employee) {
            this.employee = employee;
    }
    public String getBusiness() {
        return business;
    }
    public void setBusiness(String business) {
        this.business = "Technology ";
    }

    public void  printSorted(){
        Collections.sort(employee);
        addEmployee("Zack");
        addEmployee("Jack");
        addEmployee("Mack");
        addEmployee("Alex");
        addEmployee(null);
        addEmployee("");


        System.out.println("companyName="+name + "  businessType="+ business +"isActive="+active+"  ListOfEmployee="+employee);
    }


}
