package Day28_Methods;

import java.util.Scanner;

public class HomeworkTask {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       reverseString(scan.nextLine());

    }

    public static void calculatingScore(){

    }

    public static void reverseString(String str){
        String reversed="";
        for (int i = str.length()-1; i>=0 ; i--) {
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
    }

    public static void uniqueElements(){

    }
}
/*
6. calculate the garde of the student based on the score

    7. create a method that can reverse any String

    8. write a method that can print out the unique elements from an array of string

    9. write a method that can check if a string is plaindrome, print true if it's  otherwise print false

    10. write a method that can remeove the duplicates from the string
            "abababa"
            "ab"

    11. wirte a method that can print out the maximum number from any array of integers

    12. wirte a method that can print out the minimum number from any array of integers

 */
