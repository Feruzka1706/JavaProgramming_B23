package Day22_LoopsTopic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num1;
        int num2;
        char operator;
        String answer="yes";

        while(answer.equals("yes")){//if the answer is not no
            System.out.println("Enter two numbers:");
            num1= scan.nextInt();
            num2= scan.nextInt();

            System.out.println("Enter a math operator:");
            operator=scan.next().charAt(0);

            if(operator=='-'){
                System.out.println("Subtraction: "+(num1-num2));
            }else if(operator=='+'){
                System.out.println("Addition: "+(num1+num2));
            }else if(operator=='*'){
                System.out.println("Multiplication: "+(num1*num2));
            }else if(operator=='/'){
                System.out.println("Division: "+(num1/num2));
            }else{
                System.out.println("Invalid operator");
            }

            System.out.println("Do you want to continue?");
            answer = scan.next().toLowerCase();//maybe

           while(!(answer.equals("yes"))||answer.equals("no")) {
               //to make sure user will only enters yes or no, otherwise it will repeat again and again
               System.out.println("Invalid Entry, Please re-enter:");
               System.out.println("Do you want to continue?");
               answer = scan.next();
           }





        }



    }
}
