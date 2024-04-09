/**
 * Created by:Wondafrash
 * Date : 4/8/2024
 * Time : 1:54 PM
 */
package oracle.certificate.OnArrays;
public class BreakStatementsAndLabes {
    public static void main(String[] args) {

        String[] animal = {"Bat", "Dog", "Ox", "Cat", "Sheep", "Lion", "Tiger"};

        for (String animals : animal) {
            if (animals.equals("Sheep")) { // will stop at provided string object
                break;
            }
            //System.out.println(animals);
        }

        test_loop:
        for (String animal1 : animal) {
            if (animal1.equalsIgnoreCase("ox")) {
                break test_loop;
            }
            // System.out.println("tes_loop: " + animal1);
        }

        cat : for(String cat : animal){
            if(cat.equals("Cat")){
                break cat;
            }
           // System.out.println("cat label : "+cat);
        }

        int index = 0;
        while(index < animal.length){
           String animal0 = animal[index];

           if(animal0.equals("Cat")){
               break;
           }
            System.out.println(animal0);
           index++;
        }
    }
}