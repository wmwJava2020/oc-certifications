/**
 * Created by:AIDA
 * Date : 4/9/2024
 * Time : 10:57 AM
 */
package oracle.certificate.OnArrays;

import java.util.Date;

public class SampleExamQuestions {
    public static void main(String[] args) {
        int cnt = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                // row max is 3 and col max is 2
                //1. row = 1 and col = 1 so % condition is false and move to next till col < = 2
                //2. row = 1 and col = 2 so % condition is ture
                //3. row = 2 and col = 1 so % condition is ture
                //4. row = 3 and col = 1 so % condition is false
                //5. row = 3 and col = 2 so % condition is ture this will terminate outer loop execution
                if (row * col % 2 == 0)
                    continue ROW_LOOP; // when condition is true the loop will be terminated and move to outer loop i.e. row
                cnt++;

            }
        System.out.println(cnt);

        //int[][]java = new int[][];
        //int [][] score = new int [][]; //at lease one size is required
        Object[][][] cubiess = new Object[2][2][0];
        int [][] game = new int[3][];
       // int[][] ty = new int[]; //at lease one size is required
        java.util.Date [] dates[] = new Date[0][];
       // String[] beans = new beans[5]; // wrong using variable type as data type 'beans'

        int[] arr1;
        int[] arr2 = new int[3];
        char[] arr3 = {'a','b'};
        arr1 = arr2;
       // arr1 = arr3;

        int[] ls = {10,8,10,9};
        for(int x : ls){
            System.out.println(x+" ");
        }
    }
}
