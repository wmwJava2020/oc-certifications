/**
 * Created by:AIDA
 * Date : 4/17/2024
 * Time : 9:46 AM
 */
package oracle.certificate.methodOverride;

public class Collage {
    private String name = "Jack";
    private int year = 2025;
    private float grade = 4.09f;
    private String course = "Maths";



    public  int getYear(int year){
        int x = 1979;
        return x;
    }
    public String getCourse(String course){
        return course;
    }

    public String printDetails(){
        return name +" "+ year +" "+ grade +" "+ course;
    }

    public Collage(int grade,String course){
        this.grade = grade;
        this.course = course;
        System.out.println("Collage....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static void main(String[] args) {
        Dormitory1 d1 = new Dormitory1(23, "MATHS");
        d1.getCourse("d1");
        Campus c = new Campus(89,"Test");
        int year1 = c.getYear(78787);
        System.out.println(year1);

    }
}
