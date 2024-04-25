/**
 * Created by:Wondafrash,Wondafrash
 * Date : 4/25/2024
 * Time : 10:36 AM
 */
package oracle.certificate.dateTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateTimeFormat {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024,9,25);
        LocalTime time = LocalTime.of(10,30,36);

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE));
        System.out.println();
        DateTimeFormatter short0 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); // prints 2 digits for a year
        DateTimeFormatter medium0 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM); // prints 4 digits for a year
        DateTimeFormatter short1 =  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter short2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println("SHORT-dateTime: "+short0.format(dateTime));
        System.out.println("MEDIUM-date   : "+medium0.format(date));
        System.out.println("SHORT-time    : "+short2.format(time));
        //System.out.println("SHORT  : "+short1.format(time)); // format 'LocalizedDate' to 'time' UnsupportedTemporalTypeException

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYY hh : mm.ss:ss");  // if MM=09 ; MMM=sep ; MMMM=September ; YY 24 ; YYY=2024
        String formatted = formatter.format(dateTime); // if MM=09 ; MMM=sep ; MMMM=September ; YY 24 ; YYY=2024; else exception for 'date'
        System.out.println(formatted);

        System.out.println();

        //System.out.println(System.getenv());
        //System.out.println(System.err);
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddYYYYMM");
        System.out.println(dateFormat.format(new Date()));

        SimpleDateFormat dateFormat0 = new SimpleDateFormat("hh:mm");
        System.out.println(dateFormat0.format(new Date()));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd yyyy M"); //hours:minutes.seconds:microseconds
        System.out.println(dateTimeFormatter.format(dateTime));//format [ style should be 'dd-date' ; 'YYYY/yyyy-year' ; 'MM-month' no mm for month]

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh mm : ss"); // "'HH : MM' is unacceptable it should be hh:mm:ss.ss
        System.out.println(formatter1.format(time));


    }
}
