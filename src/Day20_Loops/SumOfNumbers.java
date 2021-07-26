package Day20_Loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int result =0;

        for (int i=0; i==0; ){ //creating infinitive loop by other way
            System.out.println("Enter a number");
            int n =scan.nextInt();


            if(n<0){//if user enters negative number
                break;//it will exist the loop
            }
            result+=n;
        }


        System.out.println(result);


    }
}
/*
Write a program that calculates the sum of numbers
entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */