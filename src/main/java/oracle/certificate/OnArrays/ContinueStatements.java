/**
 * Created by:Wondafrash
 * Date : 4/8/2024
 * Time : 2:38 PM
 */
package oracle.certificate.OnArrays;

public class ContinueStatements {
    public static void main(String[] args) {

        String[] animal = {"Cat", "Dog", "Ox", "Bat", "Sheep", "Lion", "Tiger"};

        loop_label :
        for(String rep: animal){
            if(rep.equals("Ox")){
                break loop_label;
            }
            System.out.println("label: " + rep);
        }
        for(String amp : animal){
            if(amp.equals("Bat")){
                continue; // this will skip "Bat" and continue to print the rest....
            }
            System.out.println(amp+ " ");
        }
        System.out.println();
        for(String amp : animal){
            if(amp.equals("Bat")){
                break; // this will break execution at "Bat" quit the execution
            }
            System.out.print(amp +" " );
        }
    }

}
