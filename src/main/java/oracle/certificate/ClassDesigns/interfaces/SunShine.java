package oracle.certificate.ClassDesigns.interfaces;

public interface SunShine {
    String METAL = "metal";
    float vehicleRate();
    float homeRate();
    void construcHome();
    default void getName(){
        System.out.println("defalut methods....");
    }
}
