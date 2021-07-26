package StringRecap2;

import java.util.Scanner;

public class WithoutXTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
         //if(word.charAt(0)=='a')
        if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }
        scan.close();


        String sentence="I love Java programming language";
        if(sentence.toLowerCase().contains("java")){
            System.out.println("Has Java");
        }else{
            System.out.println("Doesn't have Java");
        }
    }
}
/*
Ask user to enter a word.
If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */