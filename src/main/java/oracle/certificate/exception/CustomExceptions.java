/**
 * Created by:Wondafrash
 * Date : 4/26/2024
 * Time : 9:44 AM
 */
package oracle.certificate.exception;

class OfficeClosed extends RuntimeException {
}

class OfficeClosedForLunch extends OfficeClosed {
}

public class CustomExceptions {

    public static void main(String[] args) {

        try {
            //visitOffice();

        } catch (
                OfficeClosedForLunch lunch) {  // catch hierarchy must be child to parent or sub-class --to--> super-class
            // if parent to child order, it won't compile bc parent would catch it, so NO need it for child to be there.
            // the catch order should be 1st sub-class --- > 2nd super-class.

            System.out.println("Office Closed For Lunch....");

        } catch (OfficeClosed oc) {

            System.out.println("Office Closed");

        }

        System.out.println(calculate());
    }

    public static void visitOffice() {
        boolean b = Math.random() < 0.5;

        if (b) {
            throw new OfficeClosed();
        }
        throw new OfficeClosedForLunch();
    }

    public static String calculate() {
        String rs = "";
        String str = null;

        try {
            try {
                rs += "start "; // "" = "" + start
                str.length(); //str = null so -NPE-
                rs += "end";
            } catch (NullPointerException npe) {
                rs += "NPE"; // rs = start + NPE
                throw new RuntimeException("Runtime-Exception");
            } finally {
                rs += " Finally"; // rs = start + NPE + Finally
                throw new Exception();
            }
        } catch (Exception e) {
            rs += " Finished...."; // rs = start + NPE + Finally + Finished...
        }


        return rs;
    }

}
