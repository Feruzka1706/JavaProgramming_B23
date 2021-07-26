package Day17_StringRecap;

import java.util.Scanner;

public class FirstAndLastChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String first = word.substring(0,1);

    }
}
/*
 write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */