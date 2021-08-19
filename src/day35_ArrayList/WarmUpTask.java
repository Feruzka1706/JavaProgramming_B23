package day35_ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class WarmUpTask {
    public static void main(String[] args) {

        LocalDate[] days=new LocalDate[10];
        //this array contains 10 elements, we can store 10 elements
        //System.out.println(Arrays.toString(days));

        for (int i = 0; i < days.length; i++) {
            days[i]=LocalDate.now().plusDays(i);
            //
        }
       System.out.println(Arrays.toString(days));


        for(LocalDate each:days){
            System.out.println( each.format(DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE") ) );
        }




    }
}
/*
create an array of LocalDate and has the next 10 day's dates,
use for each loop to print each Date in the following format:
                MonthName/Day, Day Name

                ex:
                    November/25, Wednesday
 */