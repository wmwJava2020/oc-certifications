/**
 * Created by:Wondafrash
 * Date : 4/23/2024
 * Time : 12:37 PM
 */
package oracle.certificate.ClassDesigns.exam;

abstract class Social {
    public static final int x = 0;

    static void getName() {
    }

    //abstract void getJack(){}; doesn't compile non-abstract method having method declarations

    abstract void getJack1(); //abstract method having no-method declarations.

     void getJack2(){};
     public final void getSocial(){
         System.out.println("final....");
     }
}
class Students extends Social{

   /* public void getSocial(){
        System.out.println("final....");
    }*/
    @Override
    void getJack1() {

    }

    public static void main(String[] args) {
        Social social = new Students();
        social.getSocial();
    }
}
interface Student {
    public static final int x = 0;
    default void getJack(){}; // abstract method having no method declarations
    static void getName() {
    }

    public default int chew() {
        return 3;
    }

    public default int getInt(int x){
        return 0;
    }
}

class ExamQuestions implements Student {

    public String getInt(){
        return "3";
    }
    public int getInt(int input){
        return 3;
    }

    public static void main(String[] args) {
        Student test = new Testing();
    }
}

class Testing1 extends ExamQuestions {

}

class Testing extends ExamQuestions {

}
