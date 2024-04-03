/**
 * Created by:AIDA
 * Date : 4/3/2024
 * Time : 10:37 AM
 */
package oc101.OnString;

public class StringExamQuestions {
    public static void main(String[] args) {
         int numDog = 4;
         String dogType = "Husky";
       //  String anotherDog = numDog + 1; // code desn't compile adding String with int

        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.insert(1,"bb");
        sb.insert(4,"ccc");
        System.out.println(sb);


        String str = "java";
        StringBuilder ssb = new StringBuilder("java");
        //System.out.println(str == ssb); // code doesn't compile at this line
        System.out.println(str.equals(str));


        //StringBuilder ssbb = new "rumble";

        String s3 = "abcdef";
        s3.length();
        s3.charAt(3);
        //s3.charAt(6);

        String i = "012345678";
        String ssr = i.substring(1, 3);//doesn't include '3' from index 1 to index 5 exclude 5 or letter at the end won't be included or 3-1 = 2 we will get only 2 letter
        System.out.println(i.substring(7)); //7,8,.....
        System.out.println(ssr);
        System.out.println(i.substring(4,7));//456

        int r = 0;
        StringBuilder br = new StringBuilder("abcdefg");
        System.out.println(r += br.substring(1,2).length());
        System.out.println(r += br.substring(6,6).length());
        System.out.println(r += br.substring(6,5).length());
        System.out.println(r);


    }
}
