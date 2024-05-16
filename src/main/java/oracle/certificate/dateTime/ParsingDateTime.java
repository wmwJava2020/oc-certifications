/**
 * Created by:Wondafrash,Wondafrash
 * Date : 4/25/2024
 * Time : 12:55 PM
 */
package oracle.certificate.dateTime;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ParsingDateTime {

    // To convert a string to date or time, we use parse method.
    // Parsing is converting string to object representation.

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("12 10 2012", formatter);
        LocalTime time = LocalTime.parse("01:23");

        System.out.println(date);
        System.out.println(time);

        String str = date.format(formatter);
        System.out.println("formatted : "+str);
        LocalDate parsedDate = LocalDate.parse(str,formatter);
        System.out.println("reversed: "+parsedDate);



        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate localDate0 = LocalDate.of(1979,06,29);
        String dateString = localDate0.format(dateTimeFormatter);
        System.out.println(dateString);

        LocalDate date1 = LocalDate.parse(dateString,dateTimeFormatter);
        date1.plusMonths(3).plusDays(10).plusYears(1); //[The Result of 'LocalDate.plusYears()' is ignored] bc NOT assigned to a variable
        System.out.println(date1);
        System.out.println(dateTimeFormatter.format(date1));

        LocalDate date2 = LocalDate.of(2023, Month.APRIL,25);//Invalid date 'February 29' as '2023' is not a leap year
        date2.plusYears(2).plusDays(7);
        LocalDate date3 = LocalDate.of(2024,6,21);
        System.out.println(date2.getYear() + ":" + date2.getMonth() + ":"+date2.getDayOfMonth());
        System.out.println(date3);

        LocalDateTime localDateTime = LocalDateTime.of(2024,04,25,11,22,33);
        Period period = Period.of(1,2,3);
        localDateTime = localDateTime.minus(period);

        //DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT); //  11:22 'localizedTime' formatter only OUT-PUTS 'time'
        //DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); // 2/22/23 11:22 AM 'localizedDateTime' 'SHORT' year has to be 2 digits
        //DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); // 2/22/23 'localizedDate' 'SHORT' 'SHORT' year has to be 2 digits
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); //
        System.out.println(localDateTime.format(formatter1));

    }


}
