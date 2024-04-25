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
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        System.out.println("Date : "+LocalDate.now());
        System.out.println("Time : "+ LocalDateTime.now());
        System.out.println("DateTime : "+LocalDateTime.now());

        LocalDate localDate = LocalDate.of(2024, Month.APRIL,25);
        LocalTime  localTime = LocalTime.of(8,49,25);

        System.out.println("LocalDateTime : "+LocalDateTime.of(localDate,localTime));

        System.out.println();

        LocalDate date = LocalDate.of(2024, Month.APRIL,25);
        System.out.println("Orig-date : "+ date);

        LocalDate plusDays = date.plusYears(5).plusMonths(5).plusDays(5);
        System.out.println("date add  : "+ plusDays);
        System.out.println("after     : "+date);
        System.out.println();
        Date date0 = new Date();
        System.out.println(date0);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date0);
        calendar.set(Calendar.DATE, 25);
        calendar.set(Calendar.MONTH,4);
        calendar.set(Calendar.YEAR,2025);
        System.out.println("Calende : "+calendar.getTime() +" : "+calendar.getTimeZone().getDisplayName());
        System.out.println();

        LocalDate localDate0 = LocalDate.of(2024, Month.APRIL,25);
        System.out.println("before:"+localDate0);
        localDate0.plusDays(10); // return result is ignored unless assigned to a variable
        System.out.println("after :"+localDate0); // date is immutable same date will be returned

        System.out.println();

        LocalDate localDate1 = LocalDate.ofEpochDay(1);
        LocalDate localDate2 = LocalDate.now();
        //localDate2.addMinutes(20); localDate doesn't have [add] minute functionality
        System.out.println("epoch : "+localDate1);
        System.out.println("local : "+localDate2);


        LocalTime time = LocalTime.of(6,30);
        //time.addDays(3); time doesn't have 'add' days functionality

    }

}
