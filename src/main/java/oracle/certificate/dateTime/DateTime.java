/**
 * Created by:Wondafrash
 * Date : 4/25/2024
 * Time : 8:36 AM
 */
package oracle.certificate.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {
    public static void main(String[] args) {
        System.out.println("Date : "+LocalDate.now());
        System.out.println("Time : "+ LocalDateTime.now());
        System.out.println("DateTime : "+LocalDateTime.now());

        LocalDate localDate = LocalDate.of(2024, Month.APRIL,25);
        LocalTime  localTime = LocalTime.of(8,49,25);

        System.out.println("LocalDateTime : "+LocalDateTime.of(localDate,localTime));
    }

}
