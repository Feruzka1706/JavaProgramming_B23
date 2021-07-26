package day13_ScannerContinue;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your job title:");
        String jobTitle = scan.nextLine();// it takes more than one words

        System.out.println("Enter your address:");
        String address = scan.nextLine();
        // by this way we can assign whole address instead of only one word

        System.out.println("jobTitle = " + jobTitle);
        System.out.println("address = " + address);
    }
}
