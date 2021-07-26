package Day24_Array;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String sentence="I love  learning java programming language";

        String[] words=sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i>=0 ; i--) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
        String email="Cybertek@gmail.com";
        String firstName=email.split("@")[0];

        System.out.println(firstName);

        //toCharArray()

        String str="ABCDE!@#$!";
        char[] characters=str.toCharArray();

        System.out.println(Arrays.toString(characters));
    }
}
