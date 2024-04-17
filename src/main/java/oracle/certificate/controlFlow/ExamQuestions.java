/**
 * Created by:Wondafrash
 * Date : 4/2/2024
 * Time : 9:17 AM
 */
package oracle.certificate.controlFlow;

public class ExamQuestions {
    public static void main(String[] args) {
        // find the value of x;
        int m = 9, n=1,q = 0;
        while(m > n){
            m--; // m=8
            n+=2; // n = n+2 == n=1+2 = 3
            //x+=m + n; // x = x + n + m === x = 8 + 3
        }
        //System.out.println(x);
        // 1st iteration m > n ; ture === 9 > 1  and  x = x + n + m === x = 0 + 3 + 8 which is 11
        // 2nd iteration m > n ; ture === 8 > 3  and  x = x + n + m === x = 11 + 5 + 7 which is 23
        // 3rd iteration m > n ; ture === 7 > 5  and  x = x + n + m === x = 23 + 7 + 6 which is 36
        // 4th iteration m > n ; false

        int i = 4;
      //  long j = x * 4L - i++;
      //  if( j < 10) System.out.println("l");
       // else System.out.println("h");
        //else System.out.println("r"); <-- code won't compile be of two else key word
        //System.out.println(j);

        int b = 5;
         //System.out.println(b > 2?b < 4? 10:8:7);
         //System.out.println((b > 2)? ((x>4)?10:8):7); //b(5) > 2 is false and b(5) > 4 true so the 2nd will be executed which is 8
         //System.out.println((x > 2)? 8 :7);  // b(5) > 2 ture 8 will be printed

        for(int d = 0; d < 10;){
            //d = d++; // i.e.: d =d  increasing d and assigning back the variable
            //System.out.println("hell....");
        }
          //  int x = 1 , y = 15;
            //while x < 10  // doesn't compile because of this missing braces
               // y--;// y = y -1
               // x++;// x = x + 1

           // System.out.println("x="+x +"y="+y);


               // do{
              //   int y =1;
             //    System.out.println(y++ + " "); //doesn't compile bc variable "y" is declared out of scope of do
            // }while(y < 10);

        final char a ='A',d='D';
        char grade = 'B';
        switch (grade){
            case a:
            case 'B':
                System.out.print("grt");
            case 'C':
                System.out.print("good");break;
            case d :
            case 'F':
                System.out.print("NG");
        }
       //Note grtgood will print 1. bc of keyword BREAK missing bn two lines
    }
}
