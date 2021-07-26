package day13_ScannerContinue;

import java.util.Scanner; //only imports scanner class from "java.util"package

public class CentToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cents:");
        int cents= scan.nextInt();//225
        int dollar = cents/100;  //dollar is 2, 3
        int remainder = cents%100; //remainder will be 25,


        if(cents>=0) {//if the input is valid

          if (remainder == 0) {
              System.out.println(cents + " is equal to " + dollar + " dollars");
          } else {
              System.out.println(cents + " is equal to " + dollar + " dollars and " + remainder + " cents");
          }
        }else {//if input is not valid
            System.err.println("Invalid amount");
        }


    }
}
/*
Write a program that can convert cents to dollars,
if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

                Enter cents
                300 cents equal to: 3 dollars
 */