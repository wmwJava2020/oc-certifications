/**
 * Created by:Wondafrash
 * Date : 4/2/2024
 * Time : 3:52 PM
 */
package oc101.OnString;

public class MethodChaining {
    public static void main(String[] args) {

        String str0 = "java is great";
        System.out.println( str0.replace('v', 'V'));
        System.out.println(str0.replace("great", "cool"));
        System.out.println(str0.trim());
        System.out.println(str0.toLowerCase());
        System.out.println("str0 = "+str0);
        System.out.println();

        String str = "Java is great".trim().replace("cool","great").replace('v','V').toLowerCase();
        System.out.println("str = "+str);

        System.out.println();
        System.out.println(str0.equals(str));
        System.out.println(str0 == str);


        String a = "abc";
        String b = a.toUpperCase();
        String c = b.replace('A','a').replace('C','c');
        System.out.println("a = "+a +" b = "+b +" c= "+c);
        System.out.println(a==b);
        System.out.println(a.equals(b));

    }
}
