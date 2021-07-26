package Day15_String;

import java.util.Scanner;

public class FirstAndLastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        int lastIndex=sentence.length()-1;
        // in order to get the last index number we need to subtract one from the
        //length of String
        char firstCharacter= sentence.charAt(0);
        char lastCharacter=sentence.charAt(lastIndex);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

    }
}
/*
ask a user to enter a sentence
then print the first and last characters of the sentence
     Ex: We  are learning Java deeper every day


     Output: first character: W
           last character:y
 */