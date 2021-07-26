package Day14_Recap;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade number:");
        int number = scan.nextInt();
        scan.close();
        String gradeLevel="";

        if(number>=1&&number<=18){

            gradeLevel=(number<=5)? "Elementary school" :(number<=8)? "Middle school"
                    :(number<=12)? "High school" :(number<=16)? "College" :"Grad School";

        }else{//if the number is small(<) then 1 and greater(>) than 18
            gradeLevel="Invalid grade level";
        }

        System.out.println("gradeLevel = " + gradeLevel);

    }
}
/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    Other: Invalid grade level given


 */