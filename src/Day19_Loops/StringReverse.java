package Day19_Loops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String name =new Scanner(System.in).nextLine();
       //index:       012345

        String reverseName="";//azureF

        for (int i = name.length()-1; i >= 0; i--) {
            reverseName+=name.charAt(i);//getting the chars starting from last index to index 0
        //int i =name.length()-1; i>=0; i--
            //to make reverse from any given string (any length)
        }

        System.out.println(reverseName);


    }
}
