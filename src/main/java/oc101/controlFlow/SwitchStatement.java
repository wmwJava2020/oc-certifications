/**
 * Created by:AIDA
 * Date : 4/1/2024
 * Time : 10:51 AM
 */
package oc101.controlFlow;

public class SwitchStatement {
    public static void main(String[] args) {

        int locations = 0;
        System.out.println("አቅጣጫዎችን አትም.....");
        switch (locations){

            case 0 :
                              System.out.println(               "            ምዕራብ.........");
                //break;
            case 1 :
                              System.out.println(              "            ምስራቅ...........");
                //break;
            case 2 :
                              System.out.println(              "             ደቡብ...........");
                //break;
            case 3:
                              System.out.println(              "             ሰሜን............");
                break;
            default:
                System.out.println("Invalid..........");
        }
    }
}
