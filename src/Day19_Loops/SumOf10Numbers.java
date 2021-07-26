package Day19_Loops;

import java.util.Scanner;

public class SumOf10Numbers {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int result = 0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Enter a number:");
            result += scan.nextInt();
        }

              System.out.println(result);

        scan.close();
    }
}
/*
ask user to enter a number 10 times .
 Find the sum of 10 numbers
 */