/**
 * Created by:AIDA
 * Date : 4/1/2024
 * Time : 8:04 AM
 */
package oc101.controlFlow;

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
        }else{
            System.out.println("F");
        }
        return score;
    }

    public static void main(String[] args) {
        startCar();
        getScore();
    }
}
