/**
 * Created by:Wondafrash
 * Date : 4/8/2024
 * Time : 10:36 AM
 */
package oracle.certificate.OnArrays;

public class CommonArrayForLoop {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int r = arr.length;
       // int r1 = arr.length();// this is error 'length' is not a method it's a field in Arrays. class
        System.out.println(r);

        for(int i  = 2 ; i < arr.length; i++){ // the first two element will skip, the loop start from index number 2
            //System.out.println(arr[i]);
        }

        for(int i = 0; i <= arr.length ; i++){ // this will cause exception out of bound index error, or have to make length - 1
            //System.out.println(arr[i]);
        }

        String[] name = {"Jack", "Luke","Jack","Alex","Tom"};

        for(int i = 0;i < name.length; i++){
            System.out.print(name[i]+" ");
        }

        for(String names : name){
            names = name + " - "+ name; // we can't modify local variable inside for - each - loop
        }
        for(String names : name){
            // System.out.println(names);
        }

        StringBuilder[] sb = {
                new StringBuilder("For "),
                new StringBuilder(" Each "),
                new StringBuilder("  Loop ")
        };

        for(StringBuilder ss : sb){
            System.out.println(ss);
        }

        for(StringBuilder ss : sb){
            ss.append("Method");
        }
        for(StringBuilder ss : sb){
            System.out.println(ss);
        }

        String[] str = {"parrot"}; // < -- arrays
        for(String s : str){
            System.out.println(s.toUpperCase());
        }
       /* String str0 = "parrot";
        for(String s : str0){ this code doesn't compile we can't loop String as Array

        }*/

        String str1 = "parrot";
        for(char c : str1.toCharArray()){
            System.out.println(c);
        }
    }
}
