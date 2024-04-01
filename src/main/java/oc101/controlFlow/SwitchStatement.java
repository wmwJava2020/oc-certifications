/**
 * Created by:AIDA
 * Date : 4/1/2024
 * Time : 10:51 AM
 */
package oc101.controlFlow;

import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {

        int locations = 2;
        System.out.println("Print directions of the globe.....");
        switch (locations){

            case 0 :
                System.out.println("WEST..........");
                break;
            case 1 :
                System.out.println("ESAT...........");
                break;
            case 2 :
                System.out.println("SOUTH...........");
                break;
            case 3:
                System.out.println("NORTH............");
                break;
            default:
                System.out.println("Invalid..........");
        }

        Random rand = new Random();
        int c = rand.nextInt(26) + 'a';// random number from 0 to 25 will be generated and added the value of 'a' which is 97
        System.out.println((char)c +" , "+ c +" : ");

        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowles");
                break;
            case 'y':
            case 'w':
                System.out.println("Some times....");
                break;
            default:
                System.out.println("Consonant...");
        }
    }
}
