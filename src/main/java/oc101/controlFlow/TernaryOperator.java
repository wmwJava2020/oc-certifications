/**
 * Created by:AIDA
 * Date : 4/1/2024
 * Time : 9:07 AM
 */
package oc101.controlFlow;

public class TernaryOperator {


    public static void main(String[] args) {
        int x = 7;
        int y;

        if(x < 6){
            y = x++;}
        else{
            y = ++x + 1;
        }
        System.out.println("y = "+y);
        y = (x == 6) ? (x * 2) : (x + 1);
        System.out.println("y = "+y);

        // --- > y = if x<6 (?)true set y=(x*2) : or set y=(x+1)

        System.out.println(x<6 ? x*2 : "Ternary-Test"); //ternary without assignment operator can compile

        //System.out.println( y = x<6?x*2 : "test"); //ternary Operator with different data type won't COMPILE, both operand should be same data type

        int a = 5;
        int b = 5;
        int c = a > 4 ? a++ : b++;

        System.out.println("a= "+a+ " :  b= "+b + " :  c= "+c); //a =

        int d = 1;
        int e = 2;
        int f = 3;

        //r++ use variable and increment

        if( d < 0){
            f = d++ < 1 ? e++ : f++;
            // 3 < 1
        }else{
            f= (d + e) < 2 ? d++ : e++;
            // d < 0 the above d < 0 will be skipped
            // e = 3
            //f = 2 + 3 < 2 skip d++ and execute e++
            // d= 2; e = 3  ; f = 4
        }
        System.out.println("d= " +d +" e= "+e +" f= "+f); //

        int g = 4;
        int h = 5;
        int i = 2;

        if(g == 3){
            h = i*=1 < 5? g++ : i--;
        } else {
            h = i++ < 3 ? ++i : ++g;
        }
       // g = 4; h = 3 ; i = 3

        System.out.println("g= " + g + " h =" +h + " i= " +i);
    }

}