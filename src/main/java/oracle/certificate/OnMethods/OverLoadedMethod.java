/**
 * Created by:Wondafrash
 * Date : 4/15/2024
 * Time : 2:08 PM
 */
package oracle.certificate.OnMethods;

public class OverLoadedMethod {

    public void walk(int distance) {}

    public static void walk(int... varArgs) {}

    //public void walk(int arr[]){} //walk(int[])' is already defined in 'oracle.certificate.OnMethods.OverLoadedMethod'

    public static void drive(int len, float miles) {}

    public void drive(int len, float miles, float time) {}
    public static void main(String[] args) {
        //run(2); // is integer....
        run(2); // promoted to double
        run(2f); // promoted to double
        run(33l); // is long

        //sum(2,3);    // int if no int method it will promote to long
        //sum(1,2);   // long
        //sum(2,3);  // Integer
        //sum(2,3); // VarArgs
        sum(2,3);  // long -- > if no long method it will promote to double
    }

    public static int sum (int a, int b) {
        System.out.println("sum int....");
        return a + b;
    }
  /* public static long sum (long a, long b) {
        System.out.println("sum long....");
        return a + b;
    }*/
   /*public static Integer sum(Integer a, Integer b) {
       System.out.println("sum Integer....");
       return a + b;
   }*/

    public static int sum(int... numbers) {
        System.out.println("sum varArgs....");
        int sum = 0;
        for (int rs : numbers) {
            sum += rs;
        }
        return sum;
    }




    public static void run(short feet) {
    }

    public static void run(int length) {
    }

    public static void run(Integer length) {
    }

    public static void run(double km) {
    }

    public static void run(long dis) {
    }

}
