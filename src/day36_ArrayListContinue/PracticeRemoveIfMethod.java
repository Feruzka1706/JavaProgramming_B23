package day36_ArrayListContinue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeRemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,4,5,5,5,6,6,6,7,7,7,8,8) );

        System.out.println(list);
       // list.removeIf( p-> p < 5);
        list.removeIf( each -> each %2!=0);

        System.out.println(list);

        System.out.println("----------------------------------------------------------------------");
        ArrayList<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("Ahmad","Merve","Feruza","Said","Komiljon","Selda","Fhillip"));
        names.removeIf(p-> p.toLowerCase().contains("a") );

        System.out.println(names);

        System.out.println("------------------------------------------------------------------------");
        ArrayList<String> words=new ArrayList<>();

        words.addAll(Arrays.asList("Anna","Racecar","Level","Java","Python","Cybertek","Sabas","Pop","Kayak") );

       // words.removeIf(each-> StringUtility.isPalindrome(each));
        /*
        for(String each:words){
            String reverse="";

            for(int i= each.length(); i>=0; i--){
                reverse+=each.charAt(i);
            }
          boolean isPalindrome=reverse.equalsIgnoreCase(each);
            words.removeIf(p-> isPalindrome );
        }
         */


        System.out.println(words);



    }
}
