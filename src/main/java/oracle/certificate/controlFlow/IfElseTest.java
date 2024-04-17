/**
 * Created by:Wondafrash
 * Date : 4/1/2024
 * Time : 8:04 AM
 */
package oracle.certificate.controlFlow;

public class IfElseTest {

    static boolean isRunning = true;

    public static boolean startCar() {
        if (!isRunning) {
            System.out.println("is running.....true");
            return true;
        } else {
            System.out.println("is running.....false");
            return false;
        }
    }

    public static int getScore() {
        int score = 79;
        char grade;

        if (score >= 90 && score <= 100) {
            System.out.println(grade = 'A');
        } else if (score <= 89 && score >= 70) {
            System.out.println(grade = 'B');
        } else if (score <= 69 && score >= 59) {
            System.out.println(grade = 'C');
        } else if (score <= 58 && score >= 39) {
            System.out.println(grade = 'D');
        } else {
            System.out.println("F");
        }
        return score;
    }

    public static int daily() {
        int hoursOfDay = 9;

        if(hoursOfDay < 11) System.out.println("Evening......");
        else if (hoursOfDay < 5) System.out.println("Morning.......");
        else System.out.println("Noon........");
        return hoursOfDay;
    }

    public static void main(String[] args) {
        startCar();
        getScore();
        daily();
    }
}
