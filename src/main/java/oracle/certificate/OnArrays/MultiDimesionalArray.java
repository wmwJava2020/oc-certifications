/**
 * Created by:AIDA
 * Date : 4/9/2024
 * Time : 8:04 AM
 */
package oracle.certificate.OnArrays;

public class MultiDimesionalArray {
    public static void main(String[] args) {
        // one-dimensional arrays
        int[] arr = new int[4]; // this is one dimensional having four elements

        // two-dimensional arrays is like excel sheet-having rows and columns
        int[][] arr1 = new int[2][4]; // arrays with two rows and four columns, the first dimension is always a row
        int arr2[][] = new int[2][4]; // this can be accepted
        int[] arr3[] = new int[2][4]; // this can be accepted

        String[][] str = new String[][]{
                {"A", "B"}, // < -- the first has one elements
                {"C", "D"}, {"E", "F"}, // < -- the second row has two element
                {"H", "I", "J"}, {"k", "L", "M"}, {"N", "O", "P", "R"}, // < -- the third row has three element
                null, null, null, null // the last row cloud have "NULL" elements
        };

        int[][] num = new int[2][3]; // 2 rows and three columns
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;
        //num[0][3] = 4; // will throw index-out-bound-exceptions, bc the max index should be two

        // three-dimensional arrays
        // in 3-d arrays we have pages, rows and columns
        int[][][] first3Darr = new int[3][3][3]; // this can be accepted

        int[][][] second3Darr = new int[3][3][3]; // this can be accepted

        int[] third3Darray[][] = new int[3][3][3]; // this can be accepted, called c- style array declarations

        int[][][] test3D = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, // the first pages
                {{11, 12, 13}, {14, 15, 16}, {66, 67, 89}}, // the second pages
                {{33, 44, 55}, {21, 23, 45}, {46, 78, 90}} // the third pages
                //  page           row           columns
        };

        int[][][] arrD = new int[0][0][0];
        arrD [0][0][0] = 1;
        arrD [0][0][1] = 2;
           // p  r  c

    }
}
