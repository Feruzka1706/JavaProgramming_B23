package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LunchTask {
    public static void main(String[] args) {
        String[] classmates={"Ahmad","Gulistan","Yahya","Feruza","Nazli"};

        LocalDate[] dateOfBirth={ LocalDate.of(1987,10,10),
                                  LocalDate.of(2000,1,1),
                                  LocalDate.of(1991,1,9),
                                  LocalDate.of(1993,6,17),
                                  LocalDate.of(1990,3,20) };


        LocalDate youngest=dateOfBirth[0];
        int index=0;
        LocalDate oldest=dateOfBirth[0];
        int index1=0;
        for (int i = 0; i <classmates.length; i++) {

            if( dateOfBirth[i].isAfter(youngest) ){
                youngest=dateOfBirth[i];
                index=i;

            }
            if( dateOfBirth[i].isBefore(oldest) ){
                oldest=dateOfBirth[i];
                index1=i;
            }

            if( dateOfBirth[i].isLeapYear()){
                System.out.println(classmates[i]+" was born on leap Year");
            }

        }
        System.out.println(classmates[index]+" is the youngest student in the group2 "+youngest);
        System.out.println(classmates[index1]+ " is the oldest student in the group2 "+ oldest);


        System.out.println("----------------------------------------------------------------");

        DateTimeFormatter DF =DateTimeFormatter.ofPattern("EEEE, MMM/dd/YYYY");

        for (int i = 0; i < classmates.length ; i++) {
            System.out.println(classmates[i]+" was born on "+dateOfBirth[i].format(DF));
        }



    }
}
