/**
 * Created by:Wondafrash
 * Date : 4/11/2024
 * Time : 4:39 PM
 */
package oracle.certificate.OnMethods;

import java.util.Arrays;

public class MethodWithVarArgs { // VarArgs = we can have 0 to many arguments
    public static void main(String[] args) {
        drive(6);
        drive(2 ,7,9);
        drive(4, new int[]{3,5,0});
    }


    public static void drive(int start, int... number){
        //System.out.println("start + "+ start +" number = " + number.length);
        getRun();
        getRun(2,7,8);
    }

    public static void getRun(int ... numbers){
        for(int num : numbers){
            System.out.println("Num : "+num);
        }
        System.out.println("Arrays : "+Arrays.toString(numbers));
        System.out.println();
    }
}
