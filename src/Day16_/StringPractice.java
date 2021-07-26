package Day16_;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word=scan.next();//Programming;

        String result=(word.length()==0)? "String is empty"
                :(word.length()>3)? word.substring(word.length()-3)
                :word;

        System.out.println(result);
    /*
        if(word.length()==0){
            System.out.println("String is empty");
        }else if(word.length()>3){
            System.out.println(word.substring(word.length()-3) );
        }else{
            System.out.println(word);
        }

     */
        scan.close();

    }
}
/*
write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */