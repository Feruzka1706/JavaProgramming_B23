package Day23_NestedLoop;

import java.util.Scanner;

public class FrequencyofChar {
    public static void main(String[] args) {
        //Scanner scan =new Scanner(System.in);
        //System.out.println("Enter a word:");
        //String word=scan.next();
        String str ="aabcccd";

        char ch='c';
        int frequency=0;//for frequency of char

        for (int i = 0; i <=str.length()-1; i++) {
              char each =str.charAt(i);
              //to make it every single char that word has
            System.out.print(each);


            if(each==ch){//if the each char is matching with ch variable
             frequency++; //then increase the frequency of ch by 1  
            }
        }
        System.out.println();
        System.out.println("frequency = " + frequency);

    }
}
/*
Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0
 */