package day12_Scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number= input.nextInt();


        System.out.println(  (number%2 !=0)? "Odd" : "Even");

        System.out.println(  (number>0)? "Positive" :(number<0)? "Negative" : "Zero");
    }
}
