/**
 * Created by:AIDA
 * Date : 4/26/2024
 * Time : 10:58 AM
 */
package oracle.certificate.exception;

public class ReturnFinallyBlock {
    public static void main(String[] args) {
        calculate();
    }

    private static int calculate() {
        try {

            int x = 3;

            int rs = x / 1;

        } catch (Exception e) {

            //return 1; // the code doesn't compile its unreachable and execution terminates here.

            System.out.println("Exceptions thrown....");

            System.exit(0); // if try block doesn't throw an exception, this block is skipped

            return 1;

        } finally {

            System.out.println("print finally..");

            return 0;
        }
    }
}
