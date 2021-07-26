package day30_Recap;

import java.util.Scanner;

public class WhileLoopReview {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String answer="";
        int num=0, sum=0;

       while(!answer.equalsIgnoreCase("no")) {
           System.out.println("Enter a number:");
           num = scan.nextInt();
           sum+=num;
           System.out.println("Would you to enter another number?");
           answer = scan.next().toLowerCase();

           while( !(answer.equals("yes")|| answer.equals("no"))){
               System.out.println("Invalid answer! Would you like to enter another number");
               answer= scan.next().toLowerCase();
           }
           if(answer.equals("no")){
               System.out.println("Thank you!");
           }
       }

        System.out.println("sum = " + sum);
    }
}
