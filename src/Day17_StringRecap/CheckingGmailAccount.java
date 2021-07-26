package Day17_StringRecap;

import java.util.Scanner;

public class CheckingGmailAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gmail:");
        String gmail = scan.nextLine();
        String correctGmail="Cybertek@yahoo.com";

        boolean isValidGmail = correctGmail.endsWith("@gmail.com");
        System.out.println("isValidGmail = " + isValidGmail);

        System.out.println("----------------------------------");
        String url = "www.amazon.com";

        boolean isValidUrl=url.startsWith("www.")&&(url.endsWith(".com")
        || url.endsWith(".edu")|| url.endsWith(".gov"));

        System.out.println("isValidUrl = " + isValidUrl);

        System.out.println("---------------------------------------");
        System.out.println("Enter a word:");
        String word = scan.next();

        boolean endsWithLY=word.substring(word.length()-2).equals("ly");
        boolean endsWithLY2=word.endsWith("ly");

        if(endsWithLY2){
            System.out.println("really");
        }else{
            System.out.println("never mind");
        }


    }
}
/*
write a program to verify if the gmail is valid
            requirments:
                    a valid gmail account should end with @gmail.com

    2. write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */