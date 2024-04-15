    /**
 * Created by:Wondafrash
 * Date : 4/15/2024
 * Time : 10:57 AM
 */
package oracle.certificate.OnMethods;

public class PassByValue {
    public static void main(String[] args) {
        int num = 4; //the original value is set to = 4
        System.out.println(num); // 4
        getNum(100);
        System.out.println(num); // 4

        String name = "Jimmy";
        System.out.println("name="+name); // Jimmy
        newName(name);// 1st = Jimmy and 2nd = Luko
        System.out.println("Or-name="+name); // Jimmy

        System.out.println();

        StringBuilder sb = new StringBuilder();
        sb.append("String-builder-1 ");
        build(sb); // both 's' and 'sb' points to the same StringBuilder objects i.e., 'sb' and share the value
        System.out.println(sb);

        StringBuilder sbs = new StringBuilder();
        //sb = sbs;
        build(sbs);
        System.out.println(sbs); // new StringBuilder Objects sbs
    }
    public static void getNum(int num){
        System.out.println("New num =" + num);
        num = 10*2;
        System.out.println("Post num=" + num);
    }
    public static void newName(String name){
        System.out.println("name="+name); // Jimmy
        name="Luko";
        System.out.println(name); //Luko parameter value is changed to 'Luko' at this line....

    }
    public static void build(StringBuilder sb){
        //s = new StringBuilder(); // Here s will print new sb, because it points to new stringBuilder objects
        sb.append("String-builder-2 "); // both s and sb points to the same StringBuilder objects, sharing value
        System.out.println(sb);
    }

}
