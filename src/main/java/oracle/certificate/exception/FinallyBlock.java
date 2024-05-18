/**
 * Created by:Wondafrash
 * Date : 4/26/2024
 * Time : 9:16 AM
 */
package oracle.certificate.exception;

public class FinallyBlock {

    public static void main(String[] args) {
        try { // if try block without {}, the code won't compile the order must be try -> catch-> finally

            //String[] str = {"Java","can", "be"};
            String[] str = new String[5]; // NullPointerException 5 String Object is set null
            str[3] = "tokichawu";
            String upper = getNameToUpper(str);
            System.out.println(upper);

        } catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("Null Pointer Exception.....");
        } finally {
            System.out.println("Finally......");
        }

        getData(0);
    }


    private static String getNameToUpper(String[] array) {
        return array[3].toUpperCase().substring(4).toUpperCase();
    }

    private static int getData(int input) {
        int x = 3;
        try {
            x += 3; // x = x + 3 = 5
        } catch (ArithmeticException e) {
            x *= 3; // skipped
        } finally {
            x -= 5; // x = x -4; x = 5 - 5 == 0
        }

        x = x /0; // x = 1 + 3   == 4
        System.out.println("x=" + x);
        return x;
    }

    private static int getCode(){
        int a =0;
        int b = 0;
        try{
            return a / b;
        }catch (RuntimeException e){

        }
        return 0;
    }
}
