/**
 * Created by:Wondafrash
 * Date : 4/26/2024
 * Time : 8:35 AM
 */
package oracle.certificate.exception;

public class OnExceptions1 {
    public static void main(String[] args)  {

        //getName();
        //getFiles();
        String[] str = {"wondafrash", "messele"};
        getArray(str);
    }

    public static void getName() throws Exception { // this is called checked exception, i.e., we are excepting in case & compiler is complaining
        throw new Exception("Failed to call the method....");
    }

    public static void getFiles(){ // is an unchecked exception we shouldn't have to handle & declare; compiler is not complaining
        throw new RuntimeException("File couldn't be find......");
    }
    public static void getArray(String[] arr) { // is an unchecked exception we shouldn't have to handle & declare; compiler is not complaining
        for (String str : arr) {
            str.indexOf(1);
            System.out.println();
        }
    }
}
