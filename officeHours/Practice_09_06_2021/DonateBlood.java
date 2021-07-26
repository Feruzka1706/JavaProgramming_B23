package Practice_09_06_2021;

import java.util.Scanner;

public class DonateBlood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age =scan.nextInt();
        System.out.println("Please enter your weight");
        int weight=scan.nextInt();
        String result="";

        if(age>18 && weight>50){

        }else{
          result="You aren't eligible!";
        }

    }
}
/*
( Scanner Class can be used )


     Create a program that accepts age and weight(kg) as int.

    If age greater than or equal 18 and weight greater than 50 kg give a message
    EXPECTED  :  "You are eligible to donate blood"

   If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
    EXPECTED  :  "You are not eligible to donate blood"

    If age is smaller than 18 "Age must be greater than 18"
     EXPECTED  :  "Age must be greater than 18"

 */