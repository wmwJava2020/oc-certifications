/**
 * Created by:AIDA
 * Date : 3/28/2024
 * Time : 11:05 AM
 */
package oracle.certificate.operators;

public class CharacterArthritic {
    public static void main(String[] args) {

        //char is a data type that can hold from 0 to 65535 and its wrapper class is Character

        char c0 = 'a';
        char c1 = '1';

        //System.out.println("char c0 : " + c0);
        //System.out.println("char c0 : " + Character.isLetter(c0));
        //System.out.println("char c0 : " + Character.isDigit(c0));
        //System.out.println();
        //System.out.println("char c1 : " + c1);
        //System.out.println("char c1 : " + Character.isLetter(c1));
        //System.out.println("char c1 : " + Character.isDigit(c1));

        char letter = 65;
        int i = letter + 3;
        char newLetter = (char) i;
        //System.out.println("New Letter is : = "+ newLetter+" : "+"i = "+i+ " :  Initials Letter is : "+letter);

        char x = 97;
        char y = (char) (x + 1);
        char z = (char) (y + 3);
        //System.out.println("x="+x); // ASCII value is small letter a


        char a = 'A';
        char b = 65;
        //boolean c = a == b;
        char d = ++b;
        char e = d--;
        //boolean f = d == e;
        char g = b--;


        //A=65, B=66, C=67, D=68 , E=69 , F=70
        System.out.println("a="+a);//66 bc of ++a moves up
        System.out.println("d="+d);//65
        System.out.println("g="+g);//65
        System.out.println("e="+e);//66


    }
}
