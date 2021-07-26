package Day21_LoopsContinue;

import java.util.Scanner;

public class SumOFNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int sum =0;
        int num=0;
        while(num>=0) {
            System.out.println("Enter a number:");
             num =scan.nextInt();


            sum+=num;
        }

        System.out.println("sum = " + sum);
        scan.close();



    }
}
/*
Write a program that calculates the sum of numbers
entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */