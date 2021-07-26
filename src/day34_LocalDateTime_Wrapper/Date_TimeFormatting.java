package day34_LocalDateTime_Wrapper;
import java.time.*;
/*
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

 */
import java.time.format.*;

public class Date_TimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter DF= DateTimeFormatter.ofPattern("MMM/dd/YYYY EEEE");
        LocalDate today=LocalDate.now();
        System.out.println(today);

        //String now =today.format(DF); also works
        System.out.println( today.format(DF) );


        DateTimeFormatter TF =DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);
        System.out.println( currentTime.format(TF) );

        LocalTime time1 =LocalTime.of(17,25);
        System.out.println( time1);

        System.out.println(time1.format(TF));

        System.out.println("-----------------------------------------------------------------");
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMM/dd/YYYY EEEE, hh:mm a");

        LocalDateTime a =LocalDateTime.now();
        System.out.println(a);
        System.out.println( a.format(DTF));//.toLowerCase() );

        System.out.println("---------------------------------------------------------------");

        // Tuesday, 1:00 pm, Nov/24/2020
        LocalDateTime time2 =LocalDateTime.of(2020, 11, 24, 13,0);
        System.out.println(time2);
        DateTimeFormatter DTF2 =DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY");

        System.out.println( time2.format(DTF2) );
        // System.out.println(a.format(DTF).replace("AM","am").replace("PM","pm"));


        //what day is 2022-01-01
        String nameOfDay =LocalDate.of(2022,02,28).format( DateTimeFormatter.ofPattern("EEEE"));
        System.out.println(nameOfDay);

        System.out.println( nameOfTheDay(1993,6,17) );



    }

    public static String nameOfTheDay (int year, int month, int day){
        String nameOfDay =LocalDate.of(year,month,day).format( DateTimeFormatter.ofPattern("EEEE"));

        return nameOfDay;
    }
}
//  MM/dd/YYYY  formatting pattern==> 7/22/2021
//use the LocalDate & Time get the date and time in the following format:
//            Tuesday, 1:00 pm, Nov/24/2020