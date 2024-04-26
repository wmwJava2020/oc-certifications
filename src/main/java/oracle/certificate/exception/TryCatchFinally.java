/**
 * Created by:Wondafrash
 * Date : 4/26/2024
 * Time : 8:53 AM
 */
package oracle.certificate.exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            int rs = divide(x, y); // if this line throws an exception, the next line won't be executed or skipped and jump to catch block
            // if this line execute the catch block won't be executed
            System.out.println("rs = " + rs);

        } catch (ArithmeticException e) {

            e.printStackTrace();
            throw new ArithmeticException("Can't divide by zero");

        } finally { // finally, block always executes whether its thrown or not
            System.out.println("finally.....");
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
