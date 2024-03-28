/**
 * Created by:AIDA
 * Date : 3/28/2024
 * Time : 11:05 AM
 */
package oc101.operators;

public class CharacterArthritic {
    public static void main(String[] args) {

        //char is a data type that can hold from 0 to 65535 and its wrapper class is Character

        char c0 = 'a';
        char c1 = '1';

        //System.out.println("char c0 : " + c0);
        System.out.println("char c0 : " + Character.isLetter(c0));
        System.out.println("char c0 : " + Character.isDigit(c0));
        System.out.println();
        //System.out.println("char c1 : " + c1);
        System.out.println("char c1 : " + Character.isLetter(c1));
        System.out.println("char c1 : " + Character.isDigit(c1));

        char letter = 65;
        int i = letter + 3;
        char newLetter = (char) i;
        System.out.println();
        //System.out.println("New Letter is : = "+ newLetter+" : "+"i = "+i+ " :  Initials Letter is : "+letter);

        char x = 97;
        char y = (char) (x + 1);
        char z = (char) (y + 3);
        char v = (char) (6 + x);
        char w = 65;
        System.out.println(x); // ASCII value is small letter a
        System.out.println(y); // ASCII value is small letter b
        System.out.println(z); // ASCII value is small letter e
        System.out.println(v);
        System.out.println(w);
    }
}
