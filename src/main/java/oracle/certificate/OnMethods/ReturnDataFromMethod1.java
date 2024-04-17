/**
 * Created by:Wondafrash
 * Date : 4/15/2024
 * Time : 1:30 PM
 */
package oracle.certificate.OnMethods;

public class ReturnDataFromMethod1 {

    public static void main(String[] args) {
        int number = 2;
        String name = "Jack";
        long data = 4L;
        float rate = 5.4F;

        System.out.println("before assignment = "+ number + name + data + rate);

        getNumber(number); //The Result of 'ReturnDataFromMethod1.getNumber()' is ignored
        int number1 = getNumber(number); // newly incremented data reassigned to variable 'number1';

        //getName(name); // the Original copy i.e.'Jack' would be returned
        String name1 = getName(name); // the updated name value reassigned back to 'name1' and returned

        //System.out.println("after  reassigned = "+ number1 + name);

        getSize(data); // The Result of 'getSize()' is ignored
        data = getSize(data); // reassigning the of value 'data' to a return value from 'method' so it will increment a calculated value
        //System.out.println(data);

        getRate(rate); //The Result of 'getRate()' is ignored if it is not reassigned to a variable
        rate = getRate(rate); // the newly calculated rate would be returned OR reassigning to the 'caller'
        //System.out.println(rate);

        System.out.println("after reassigned  = "+ number1 + name1 + data + rate);
    }

    public static int getNumber(int number){
        number += 2; // number = number(2) + 2
        return number; // this variable is a return value for getNumber in the main method
    }

    public static String getName(String name){
        name = "Mack";
        return name;
    }

    public static long getSize(long data){
        data *=4/2; // data = data + 4
        return data;
    }

    public static float getRate(float rate){
        rate *=3/2; // rate = rate * 3
        return rate;
    }

}
