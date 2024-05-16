package oracle.certificate.introduction;

public class OnLocalVariable {

    static Object o1 = new Object();
    static Object o2;

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o3;

        int i;
        int j = 0;
        System.out.println("local o1: "+o1);
        System.out.println("global o1:"+o1);
        System.out.println("global:"+o2);
        //System.out.println(o3);//local variable needs to be initialized before use otherwise it won't compile
        System.out.println(j);
    }
}
