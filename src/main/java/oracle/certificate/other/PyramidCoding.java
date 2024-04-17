/**
 * Created by:AIDA
 * Date : 3/28/2024
 * Time : 2:21 PM
 */
package oracle.certificate.other;

public class PyramidCoding {
    public static void main(String[] args) throws InterruptedException {
        int row  = 10;

        for(int x = 0; x < row;x++){
            for(int y = row - x; y > 1; y--){
                System.out.print(" ");
            }

            for(int y = 0; y <= x;y++){
                Thread.sleep(100);
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
