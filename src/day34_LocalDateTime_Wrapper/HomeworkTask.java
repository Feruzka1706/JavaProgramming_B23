package day34_LocalDateTime_Wrapper;
import java.time.format.*;
import java.time.*;

public class HomeworkTask {
    public static void main(String[] args) {

        DateTimeFormatter DTF= DateTimeFormatter.ofPattern("YYYY-MMM-dd hh:mm:ss a");

         //LocalDate date =LocalDate.of(2019,10,16);
         //LocalTime time =LocalTime.of(8,21,24);
        LocalDateTime dateTime=LocalDateTime.of(2019,11,16,20,21,24);

        System.out.println("local Date Time: "+dateTime.format(DTF));
    }
}
/*
Local Date: 2019-Nov-16
Local Time: 08:21:24 AM

Combine local Date Time: 2019-Nov-16 08:21:24 AM
 */