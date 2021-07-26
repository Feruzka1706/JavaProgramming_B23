package day12_Scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number between 1-7");
        int number= input.nextInt();

        String result="";
        if(number==1){
            result="Monday";
        }else if(number==2){
            result="Tuesday";
        }else if(number==3){
            result="Wednesday";
        }else if(number==4){
            result="Thursday";
        }else if(number==5){
            result="Friday";
        }else if(number==6){
            result="Saturday";
        }else if(number==7){
            result="Sunday";
        }else{
            result="Invalid day, please try again";
        }

        System.out.println("You entered day = "+result);
    }
}
