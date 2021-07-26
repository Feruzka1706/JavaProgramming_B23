package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate eid =LocalDate.of(2021,7,20);

        System.out.println(eid);

        LocalDate today =LocalDate.now();
        System.out.println(today);

        System.out.println("-----------------------------------------------------");
        //create array of string to store 5 classmates' name
        String[] classmates={"Gulistan","Nazli","Ahmad","Yahya","Maftuna"};

        LocalDate[] dateOfBirth ={ LocalDate.of(1990,5,25),
                    LocalDate.of(1980,6,20),
                LocalDate.of(1985,7,18),
                LocalDate.of(1993,6,17),LocalDate.of(1998,2,16) };


        for (int i = 0; i < classmates.length ; i++) {

            System.out.println(classmates[i]+"' birthday is: "+dateOfBirth[i]);
        }

        System.out.println("--------------------------------------------------------");
        LocalDate person1=LocalDate.of(1980,12,11);
        LocalDate person2=LocalDate.of(1980,12,25);

        if( person1.isBefore(person2) ){
            System.out.println("person1 is older");
        }else{
            System.out.println("person2 is older");
        }

        if( person1.isAfter(person2) ){
            System.out.println("person1 is younger");
        }else{
            System.out.println("person2 is younger");
        }

        System.out.println("---------------------------------------------------------------");

        boolean r1 =person1.isLeapYear();
        System.out.println(r1);

        boolean r2 =LocalDate.of(2023,1,1).isLeapYear();
        System.out.println(r2);

        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);


        LocalDate unitAssestment3 =currentDate.plusDays(14);
        System.out.println(unitAssestment3);

        LocalDate unitAssesment4 =currentDate.plusMonths(1);
        System.out.println(unitAssesment4);

        LocalDate graduateTime =currentDate.plusMonths(6);
        System.out.println(graduateTime);

        LocalDate examDate =currentDate.plusWeeks(2);
        System.out.println(examDate);

    }
}
