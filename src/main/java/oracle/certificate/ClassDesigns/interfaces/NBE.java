/**
 * Created by:Wondafrash
 * Date : 4/22/2024
 * Time : 1:22 PM
 */
package oracle.certificate.ClassDesigns.interfaces;

public interface NBE {

    public static final String bank0 = "AWASH-BANK"; // PUBLIC STATIC FINAL - is redundant by default all variables are PSF in the interface
    public static final String bank1 = "NIB-BANK";
    public static final String bank2 = "DASHEN-BANK";
    String bank3 = "HIBRET-BANK"; // PUBLIC STATIC FINAL - is redundant by default all variables are PSF in the interface
    float rate = 2.890F;

    public abstract void businessRate(); // public abstract is redundant by default all methods are PS in the interface
    float vehicleRate();
    float homeRate();
    default void getLoactions(){}

}
