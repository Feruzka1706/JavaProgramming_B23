package Day17_StringRecap;

import java.util.Scanner;

public class InitialPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName=scan.next();
        System.out.println("Enter your last name:");
        String lastName =scan.next();

        String initial=firstName.substring(0,1).toUpperCase()
                +firstName.substring(1).toLowerCase();
        //create substring for first character of first & last name , then called to Upper Case


       // String initial=firstName.charAt(0)+"."+lastName.charAt(0);
        //initial=initial.toUpperCase();
        
        //String initial=firstName.toUpperCase().charAt(0)+
               // "."+lastName.toUpperCase().charAt(0);

        System.out.println("initial = " + initial);
    }
}
/*
 write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
 */