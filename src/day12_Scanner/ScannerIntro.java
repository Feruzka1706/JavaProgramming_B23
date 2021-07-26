package day12_Scanner;
//it goes always between package and class !
import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
       int num1 = input.nextInt();
        System.out.println("Enter your second number:");
       int num2 = input.nextInt();

       int addition = num1+num2;
       int subtraction = num1-num2;
       int multiplication = num1*num2;
       int division = num1/num2;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);

    }
}
/*
input, scan,
(variable names)
 */