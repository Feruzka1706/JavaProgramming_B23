package Day22_LoopsTopic;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String answer ="";

        do {
            System.out.println("Enter two numbers:");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println("Addition: " + (num1 + num2));

            System.out.println("Do you want to continue?");
            answer= scan.next();

            while(!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid Answer, Please re-enter! Do you want to continue again?");
                scan.nextLine();
                answer = scan.nextLine().toLowerCase();
            }
            /*
            while( !(answer.equals("yes") || answer.equals("no") ) ){
                //while is answer is not yes /no, it will repeat asking again and again
                System.out.println("Invalid Answer, Please re-enter!");
                System.out.println("Do you want to continue?");
                answer= scan.next().toLowerCase();
            }

             */

        }while(answer.equalsIgnoreCase("yes"));//false)

        System.out.println("Thank you for using our calculator, GoodBye!");

        scan.close();


    }
}
/*
write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
 */