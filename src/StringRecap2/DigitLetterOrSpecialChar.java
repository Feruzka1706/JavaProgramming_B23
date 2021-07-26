package StringRecap2;

import java.util.Scanner;

public class DigitLetterOrSpecialChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word =scan.next();
        char firstChar =word.charAt(0);

        if(firstChar>='0'&&firstChar<='9'){
            System.out.println("First charcter is digit");
        }else if(firstChar>='a'&&firstChar<='z'){
            System.out.println("First character is lower case letter");
        }else if(firstChar>='A'&&firstChar<='Z'){
            System.out.println("First character is UpperCase letter");
        }else{
            System.out.println("First character is special character");
        }
        scan.close();
    }
}
/*
Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"
 */