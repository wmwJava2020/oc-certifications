/**
 * Created by:Wondafrash
 * Date : 4/15/2024
 * Time : 12:51 PM
 */
package oracle.certificate.OnMethods;

public class ReturnDataFromMethod {

    public static void main(String[] args) {
        int number = 1; // this variable didn't get incremented rather the one that was copied to the method did increment
        String word = "string";

        //number(number); // Since we didn't reassign this variable to another variable, the result will be ignored

        number(number);
        int num = number(number); //reassigning back variable returned after increment to other, so the value is updated to '2';

        word = word(word); //
        System.out.println("number var not reassigned : "+number + word);
        System.out.println("number var reassigned     : "+num + word);
    }

    public static int number(int number){
        number++;
        return number;
    }

    public static String word(String word){
        word += "A";// word = word + A
        return word; //word represent wordA
    }

}
