package Day19_Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word =new Scanner(System.in).next();
        String reverseWord="";//Level==>level

        for (int i = word.length()-1; i >=0 ; i--) {
            reverseWord+=word.charAt(i);
        }
        
        boolean isPalindrone=word.equalsIgnoreCase(reverseWord);

        System.out.println("isPalindrone = " + isPalindrone);
        /*
        if(isPalindrone){
            System.out.println(word+" is Plindrome");
        }else{
            System.out.println(word+" is not Palindrome");
        }
        */

    }
}
