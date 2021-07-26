package Day15_String;

import java.util.Scanner;

public class LongestStringMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String string1=scan.nextLine();
        String string2 = scan. nextLine();

        if(string1.length()>string2.length()){
            System.out.println(string1);
        }else if(string1.length()==string2.length()){
            System.out.println("Equal");
        }else{
            System.out.println(string2);
        }
      scan.close();
    }
}
/*
Write a program that asks user enter two strings, and print out the longest string

   Ex:Cybertek;
      Cybertek School;

   output:Cybertek School;
 */