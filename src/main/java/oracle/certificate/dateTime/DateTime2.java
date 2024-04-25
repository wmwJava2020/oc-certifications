/**
 * Created by:Wondafrash,Wondafrash
 * Date : 4/25/2024
 * Time : 9:42 AM
 */
package oracle.certificate.dateTime;

import java.time.*;

public class DateTime2 {
    public static void main(String[] args) {
    LocalDate start = LocalDate.of(2024, Month.APRIL,25);
    LocalDate end  = LocalDate.of(2024,Month.JUNE,25);
    Period period = Period.ofDays(19);

        cleanTheGarage(start,end);
        garageCleanSchedules(start,end, period);


        System.out.println(start.plusWeeks(1));
        System.out.println(LocalDateTime.now().plus(period));
        //System.out.println(LocalTime.now().plus(period)); localTime doesn't have weeks to add "unsupported days unit exceptions"

        Period ofMonth = Period.ofMonths(4);
        System.out.println("ofMonth : "+ofMonth);

        // Period ofYear = Period.ofYears(2).ofMonths(4); // both ofYears() and ofMonth() are static. We can't change method on Period class in this case 'ofYears()'
        Period ofYear = Period.ofYears(2).ofMonths(4); //Static member 'java.time.Period.ofMonths(int)' accessed via instance reference. It 'ONLY' prints 'P4M'
        System.out.println("ofYear : "+ofYear);

    }

    public static void cleanTheGarage(LocalDate start, LocalDate end){
        while(start.isBefore(end)){
            System.out.println("Clean the Garage on: " + start.toString().substring(8) +"th of Every Month");
            start = start.plusMonths(1);
        }
    }

    public static void garageCleanSchedules(LocalDate start, LocalDate end, Period period){
        while (start.isBefore(end)){
            System.out.println("Clean Schedule Dates is " + start);
            start = start.plus(period);
        }
    }

}
