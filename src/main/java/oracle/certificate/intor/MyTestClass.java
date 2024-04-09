package oracle.certificate.intor;

public class MyTestClass {
    int abc = 10;
    public static void getTested(){

        //int a = 1111;
        {
           int a = 1;
            System.out.println(a);
        }
        {
          int a = 11;
            System.out.println(a);
        }
        {
            int a = 111;
            System.out.println(a);
        }


    }

    public static void main(String[] args) {
        getTested();
    }
}
