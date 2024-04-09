package oracle.certificate.intor;

public class PrimitiveWrapperClass {

    public static void main(String[] args) {
        String s = "22";
       // Integer i = new Integer(10);
        Integer i0 = Integer.valueOf(s);
        Integer i1 = Integer.parseInt(s);
        //System.out.println(i1);
        String Public;
        String _huaw3;
        String A$B;
        String a1_kio;

        int array[] = {0, 1, 2, 3, 4};
        int key = 3;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == key) {
                break;
            }
           // System.out.print(" Found " + key + " at " + i);
        }

        String ss = "Mack";
        Class<? extends String> aClass1 = ss.getClass();
        System.out.println("str: "+aClass1);
        StringBuilder sb = new StringBuilder("Jack");
        Class<? extends StringBuilder> aClass = sb.getClass();
        System.out.println("sb: "+aClass);

        short sht = 3112;
        String string = "shsusl";
        //theString.length();


    }
}



