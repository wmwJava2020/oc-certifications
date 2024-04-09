/**
 * Created by:wondafrash
 * Date : 4/8/2024
 * Time : 4:47 PM
 */
package oracle.certificate.OnArrays;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        Arrays.sort(args);
        int len = args.length;
        System.out.println(len);
        System.out.println(Arrays.toString(args));

        print("Jack","Mack","Zack");
        print("a","k","Y","O","8");
        print("Wondafrash");
        print("90");
    }

    private static void print(String... inputs){ // < -- this method will accept any numbers string arguments
        System.out.println(Arrays.toString(inputs));
    }
}
