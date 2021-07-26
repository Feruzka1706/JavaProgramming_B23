package day13_ScannerContinue;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number");
        int buildingNumber=scan.nextInt();//7925 (Enter....)

        scan.nextLine();//to clean Scanner's memorize
        System.out.println("Enter your street address:");
        String streetAddress= scan.nextLine();

        System.out.println("Enter your city name:");
        String city = scan.nextLine();

        System.out.println("Enter your state name:");
        String state= scan.next();

        System.out.println("Enter your zip code:");
        String zipCode= scan.next();

        scan.nextLine();
        System.out.println("Enter your full name:");
        String fullname= scan.nextLine();

        String shippingInfo=fullname+"\n"+buildingNumber+" "+streetAddress+"\n"+
                city+", "+state+" "+zipCode;

        System.out.println(shippingInfo);


    }
}
/*
ask the following requirements:
            1.Building number(nextInt)
            2.Street Address (nextLine)
            3.City Name (nextLine)
            4. State : CA, NY, MA, FL... (next)
            5. Zip Code (next)
            6.Full Name (nextLine)

print the shipping info of the person

    Ex: Aysu Ahmadil
        7945 Jones Branch Drive
        McLean, VA 22012
 */