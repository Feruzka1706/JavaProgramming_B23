package Day16_;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two word:");
        String word1 = scan.next();//apple
        String word2 = scan.next();//banana
        String result="";
        if(word1.length()>=2 && word2.length()>=2) {
            result = word1.substring(1) + word2.substring(1);
            System.out.println(result);
        }else{
            result="Too short";
        }
        scan.close();

        System.out.println(result);
    }
}
/*
 Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */