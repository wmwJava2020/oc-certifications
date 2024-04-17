/**
 * Created by:Wondafrash
 * Date : 4/16/2024
 * Time : 1:53 PM
 */
package oracle.certificate.ClassDesigns;

public class ImmutableClasses {
    // to make a class immutable

    // 1. make your field private and final
    private final double price;
    private final String destination;
    private final String source;
    private final float rate;

    //2. use a contractor call
    ImmutableClasses(double price,String destination,String source,float rate){
        this.destination = destination;
        this.rate = rate;
        this.price = price;
        this.source = source;
    }

    //3. apply getters only for outside user
    public String getDestination(){
        return destination;
    }
    public double getPrice(){
        return price;
    }
    public String getSource(){
        return source;
    }
    public float getFloat(){
        return rate;
    }

}
