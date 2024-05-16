/**
 * Created by:Wondafrash
 * Date : 4/23/2024
 * Time : 10:00 AM
 */
package oracle.certificate.ClassDesigns.polymorphysim;
class Dog extends Animals{
    @Override
    public void getName() {
        super.getName();
    }
    public void printDetails(){
        System.out.println("age="+age +" : "+"breed="+breed +"name=" +name);
    }
    public void eat(){
        System.out.println("Dog eats meat....");
    }
}
class Rabbit extends Animals{
    @Override
    public void getName() {
        super.getName();
    }

    public void printDetails(){
        System.out.println("age="+age +" : "+"breed="+breed +" name=" +name);
    }

    @Override
    public void eat() {
        System.out.println("Rabbit eats leaves...");
    }
}

class Husky extends Dog{
    public void eat(){
        System.out.println("Husky eats meat....");
    }
    public void printDetails(){
        System.out.println("age="+age +" : "+"breed="+breed +" name=" +name);
    }
}

class Bird extends Animals{
    void fly(){
        System.out.println("Birds can fly...");
    }
    public void printDetails(){
        System.out.println("age="+age +" : "+"breed="+breed +" name=" +name);
    }
}

class Eagle extends Bird{
    @Override
    public void eat() {
        System.out.println("eagles eat chicken...");
    }
    public void printDetails(){
        System.out.println("age="+age +" : "+"breed="+breed +" name=" +name);
    }
}
public class Animals {
    int age = 5;
    String breed = "European";
    String name = "Dido...";

    public void getName(){
        System.out.println("get Name from Animal...");
    }

    void printName(){
        System.out.println("Name= " + name);
    }
    public int getWeight(int x){
        return 3;
    }
    public void eat(){
        System.out.println("All [ Animals ] eat....");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printDetails(){
        printName();
        System.out.println("age="+age +" : "+"breed="+breed);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class PolymorphicClass{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName();
        dog.setAge(34);
        dog.setBreed("BullDog");
        int weight = dog.getWeight(4);
        System.out.println(weight);
        System.out.println("age="+dog.age +" "+"breed="+ dog.breed);
        dog.eat();
        Husky husky = new Husky();
        Dog dog0 = husky;
        dog0.eat();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();

        Animals animals = new Eagle();
        animals.setBreed("Breed .. Unknown...");
        System.out.println(animals.getBreed());
        animals.getWeight(3);

        // Bird bird = new Dog(); both have the same parent but not related

        //Bird bird = (Bird) new Animals(); with [upcast] compiles but throws runtime exception "ClassCastException"

        Object object = new Eagle();    // Okay.....

        //Eagle eagle0 = (Eagle) new Object();with [upcast] compiles but throws runtime exception "ClassCastException"

        // Below, we have three different types of eagle reference in memory;
        // these are
        // [ 1. eagle of type Eagle
        // 2. Bird0 of type Bird
        // 3. eagleObj of type Objects]
        Eagle eagle = new Eagle();
        Bird bird0 = eagle;
        Object eagleObj = eagle;
        // Eagle class is a polymorphic class

        System.out.println();

        Animals animals1 = new Bird();
        animals1.printDetails();
        String breed = animals1.getBreed();
        System.out.println(breed);

        System.out.println();

        Animals animals2 = new Bird();
        //animals2.printDetails();
        animals2.setName("Boby");

        Animals animals3 = new Eagle();
        animals3.setBreed("African  ");
        animals3.setName("Chilo");
        //animals3.printDetails();

        Animals animals4 = new Dog();
        animals4.setBreed("Black  ");
        //animals4.printDetails();

        Animals animals5 = new Husky();
        animals5.setBreed("America  ");
        animals5.setName("Jack");
        //animals5.printDetails();

        getAllDetails(animals5);
        getAllDetails(animals4);
        getAllDetails(animals3);
        getAllDetails(animals2);

    }

    // Polymorphic parameters using top objects in the hierarchy as an input parameters
    // then invokes all methods by providing different input[of extending classes]
    public static void getAllDetails(Animals animals){
        animals.printDetails();
    }
}
