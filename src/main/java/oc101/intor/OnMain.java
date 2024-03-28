package oc101.intor;

public class OnMain {

    public static void main(String[] args) {
       long max = 8734324908787L;
        Long aLong = Long.valueOf(max);
        //System.out.println(aLong);
        int v = 022;

        String s = Integer.toOctalString(v);
       // System.out.println(s);

        int hexDec = 0x1E;
        String s1 = Integer.toHexString(hexDec);
        //System.out.println(s1);

        int x,y,z;
        int a; int b;
        float f1, f2;
        double d1; double d2;

        char[] chars = new char[]{'\u0097'};
        System.out.println(chars.length);
        String str = new String(chars);
        System.out.println(str.length());
        byte[] bytes = str.getBytes();
        System.out.println(bytes.length);

        char c = 'a';
        byte[] ss = String.valueOf(c).getBytes();
        System.out.println("Value of char a: "+ss.length);

        float _ublic;
    }
}
