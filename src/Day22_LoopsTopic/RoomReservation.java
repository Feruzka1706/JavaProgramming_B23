package Day22_LoopsTopic;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int totalPrice =0;
        System.out.println("Welcome to Cybertek Hotel");
        System.out.println("Would you like to reserve a room?");

        String answer =scan.next().toLowerCase();
        scan.nextLine();

        while(!(answer.equals("yes")|| answer.equals("no"))){
            //to make sure user enters either yes or no
            System.out.println("Would you like to reserve a room?");
            answer=scan.nextLine().toLowerCase();
        }

        while(answer.equals("yes")){
            System.out.println("Which bed type do you want?");
            //king bed, queen bed, twin, single bed....
            String bedType= scan.nextLine().toLowerCase();

            if(bedType.equalsIgnoreCase("king bed")){
                totalPrice+=120;
            }else if(bedType.equalsIgnoreCase("queen bed")){
                totalPrice+=100;
            }else if(bedType.equalsIgnoreCase("single bed")){
                totalPrice+=80;
            }else{
                System.out.println("Invalid room selected");
            }

            System.out.println("Do you want to reserve another room?");
            answer=scan.nextLine().toLowerCase();


        }
        System.out.println("Your total price is: "+totalPrice);


        //while(answer.equals("yes"))

    }
}
/*
 write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve and calculates the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            otherwise return the  total price
 */