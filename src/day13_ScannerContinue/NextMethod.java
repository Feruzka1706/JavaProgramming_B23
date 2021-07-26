package day13_ScannerContinue;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next(); //only takes the first word
        // it cannot take if the name is consist two words ex: first and last name

        System.out.println("Enter your last name");
        String lastName= scan.next();//only takes the first word
        
        String fullName= firstName+lastName;
        System.out.println("fullName = " + fullName);

        System.out.println("Enter your address");
        String address= scan.nextLine();//it accepts more than one word
        //ex: address: 7840 Walerga Rd Apt 223 Antelope, CA 95843
    }
}
