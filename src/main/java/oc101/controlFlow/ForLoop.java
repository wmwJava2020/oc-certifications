/**
 * Created by:Wondafrash
 * Date : 4/1/2024
 * Time : 4:22 PM
 */
package oc101.controlFlow;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i+=1){
            if(i%2==0){
            //System.out.print(i + "  :  " );
            }
            else{
                if(i%2!=0){

                    //System.out.println(i + "  :  " );
                }
            }
        }

        int x = 0;
        for(int y =4,z =0;x < 5 && y < 10;x++ , y++){
            System.out.println("y="+y );
        }
        System.out.println();
        System.out.println("x="+x);

    }
}
