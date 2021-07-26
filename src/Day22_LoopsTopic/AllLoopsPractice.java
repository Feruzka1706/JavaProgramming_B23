package Day22_LoopsTopic;

import java.util.Scanner;

public class AllLoopsPractice {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
            System.out.println("Feruza SDET");
        }

        System.out.println("-----------------------------");

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next();

        for (int i =word.length()-1; i>=0; i--) {
            System.out.print(word.charAt(i));
        }


        System.out.println();
        System.out.println("--------------------------------------");
        String word1="Feruza";
        //index:      012345;
        String reverseWord=""+word1.charAt(5)+word1.charAt(4)+word1.charAt(3)
                +word1.charAt(2)+word1.charAt(1)+word1.charAt(0);

        System.out.println(reverseWord);

    }
}
