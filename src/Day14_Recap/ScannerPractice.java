package Day14_Recap;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        short year = scan.nextShort();

        System.out.println("Enter your birth month:");
        byte month = scan.nextByte();

        System.out.println("Enter your birth day:");
        byte day = scan.nextByte();

        boolean isValid =(year>0 && year<2021) && (month>=1 && month<=12) && (day>=1 && day<=31);

        if(isValid){
            System.out.println(month+"/"+day+"/"+year+ " is your birthday");

        }else{
            System.out.println("Invalid Enters");
        }
       scan.close();



    }
}
/*
- - Ask the user to enter the year, month number,
and day they were born and print in the following format:
                "%month / day / year is your birthday "



task2:
        - - Ask the user to enter their zipcode (long),
        the number of people they live with (byte),
        if they are married or not (boolean - true for married/false for not)
        and print the values in the following format:

            Ex:
                inputs: 31009, 4, false

                output:
                     I see you are not married and live with 4 people
                     in your house which is in the 31009 area!

 */