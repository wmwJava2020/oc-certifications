/**
 * Created by:Wondafrash
 * Date : 4/11/2024
 * Time : 4:13 PM
 */
package oracle.certificate.OnMethods;

public class OnParameters {

    public void getSum(){}; // 0 argument method niladic method

    public int getSum(int x){ return x;} // method with 1 argument monadic

    public String getTest(String s1, String s2){ // method with 2 arguments dyadic
        return s1 + s2;
    }
    public long getSize(long x, long y, long r){ // method with 3 arguments triadic
        return x + y +r;
    }

    public int getLength(int a, int b, int c, int d){ // method with 4 arguments polyadic
        return (a + b + c) / d;
    }

    //int getDistance(int x;int b){} //doesn't compile parameters should be separated by comma


}
