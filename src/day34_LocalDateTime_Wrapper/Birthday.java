package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class Birthday {
    public static void main(String[] args) {

        birthday(1993,6, 17);
        independenceDay(2022,7,4);
    }

    public static void birthday (int year, int month, int day){

        LocalDate dateOfBirth=LocalDate.of(year,month,day);//1985-7-22
        LocalDate today=LocalDate.now();//2021-7-22
        int age= today.getYear()-dateOfBirth.getYear();

        if( dateOfBirth.getMonthValue()==today.getMonthValue()
                && dateOfBirth.getDayOfMonth()==today.getDayOfMonth() ){
            System.out.println("Happy birhtday! You are "+age+ " years old");
        }else{
            System.out.println("Today is not your birhtday :(");
        }


    }

    public static void independenceDay(int year, int month, int day){
        LocalDate independence =LocalDate.of(year,month,day);
        LocalDate today=LocalDate.now();

        if( independence.getMonthValue()== today.getMonthValue()
              && independence.getDayOfMonth()== today.getDayOfMonth()){
            System.out.println("Today is Indedependence day! Happy 4th of July!");
        }else{
            System.out.println("Today is not Independence day");
        }
    }


}
