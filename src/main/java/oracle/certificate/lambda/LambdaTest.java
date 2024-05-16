/**
 * Created by:AIDA
 * Date : 4/25/2024
 * Time : 3:37 PM
 */
package oracle.certificate.lambda;

import java.util.ArrayList;
import java.util.List;

class Animal{
    private boolean jump;
    private boolean swim;
    private String type;

    public Animal(String type,boolean jump, boolean swim) {
        this.type = type;
        this.jump = jump;
        this.swim = swim;

    }

    public String getType() {
        return type;
    }
    public boolean canJump() {
        return jump;
    }


    public boolean canSwim() {
        return swim;
    }



    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "jump=" + jump +
                ", swim=" + swim +
                ", type='" + type + '\'' +
                '}';
    }
}

interface checkAnimal{
    boolean check(Animal animal);

}

class AnimalImpl implements checkAnimal{
    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }

}
public class LambdaTest {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", true,true));
        animals.add(new Animal("Cat",true,false));
        animals.add(new Animal("Dog",true,true));
        //animals.add(new Animal("Rabbit",true,false));
        animals.add(new Animal("Horse",true,false));
        //animals.add(new Animal("eagle",true,false));
        animals.add(new Animal("Donkey",false,true));

        String s = "Cat";
        animals.removeIf(e -> {
            return e.getType().equals("Cat");
        });
        System.out.println("removeIf : "+animals);

        //print(animals, new AnimalImpl());

        print(animals, animal -> !animal.canSwim()); // !animal.canSwim() NOT swim
        //print(animals, animal -> !animal.canJump());
        //print(animals, Animal::canJump); // using method reference
    }

    private static void print(@org.jetbrains.annotations.NotNull List<Animal> animals, checkAnimal filter){
        for(Animal e : animals){
            if(filter.check(e)){
                System.out.println(e.getType());
            }
        }
    }
}
