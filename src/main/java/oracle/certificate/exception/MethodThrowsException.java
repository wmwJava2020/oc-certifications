/**
 * Created by:AIDA
 * Date : 4/26/2024
 * Time : 11:19 AM
 */
package oracle.certificate.exception;

class AnimalEatPlantsException extends Exception {
}

class AnimalEatMeatException extends RuntimeException {
}

interface Omnivore {
    void eatMeat(int amount) throws AnimalEatPlantsException;

    void eatPalnt(int amount);
}

class Bear implements Omnivore {

    @Override
    public void eatMeat(int amount) throws AnimalEatPlantsException { // It is a checked Exception, need to be handled or declared. Exception should also be assigned for interface
        if (amount <= 0) {
            throw new AnimalEatPlantsException();
        }
        System.out.println("This Animal eats Meat");
    }

    @Override
    public void eatPalnt(int amount) { // This is an unchecked Exception so No need to declare or handle this exception
        if (amount >= 0) {
            throw new AnimalEatMeatException();
        }
        System.out.println("This Animal eats Plant");
    }
}

public class MethodThrowsException {

    public static void main(String[] args) throws AnimalEatPlantsException { // Since eatMeat is checked exception, We have to declare / handle exception here as well
        Bear bear = new Bear();
        try {
            bear.eatMeat(2);
            bear.eatPalnt(-2); // for unchecked exception it not mandatory to include inside ytr catch block
        }
//        catch (RuntimeException e){ doesn't compile bc a subclass 'AnimalEatMeatException' required to catch the exception first.
//            e.printStackTrace();
//            System.out.println("print run time exception");
//        }
        catch (AnimalEatPlantsException e) {
            e.printStackTrace();
            System.out.println("Bear is ... hungry ... ");
        }
        catch (AnimalEatMeatException e) {
            e.printStackTrace();
            System.out.println("Animal Eat Meat Exception");
        }
        catch (RuntimeException e){ //doesn't compile bc a subclass 'AnimalEatMeatException' required to catch the exception first.
            e.printStackTrace();
            System.out.println("print run time exception");
        }finally {
            {
                System.out.println("print finally...");
            }
        }

    }

}
