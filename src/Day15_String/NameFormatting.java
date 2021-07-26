package Day15_String;

import java.util.Scanner;

public class NameFormatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName=scan.next().trim();
        //add trim() method to take off extra white spaces
      firstName =firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();


        System.out.println("Enter your last name:");
        String lastName=scan.next().trim();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+lastName);

    }
}
/*
ask user to enter first name:
     1. make sure there is no white space
     2. Make sure first character is upper case & rest of the characters need to be in lowercase

     Ex:
       (white space)          mUHTar

    Output:
           Muhtar
 */