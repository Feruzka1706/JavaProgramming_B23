package day13_ScannerContinue;

import java.util.Scanner;

public class DisadvanatgesOfNextMethod {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt(); // 28 Enter

        scan.nextLine();//to clean scanner's memory! to make it clear for next lines

        System.out.println("Enter your job title:");
        String jobTitle = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);
    }
}
