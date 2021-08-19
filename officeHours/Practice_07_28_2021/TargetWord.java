package Practice_07_28_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TargetWord {
    public static void main(String[] args) {

        ArrayList<String> words =new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium") );

        String targetWord="java";

       //Option 1
        int count=0;
        for(String each: words){
            if(each.equals(targetWord)){
                count++;
            }
        }

        System.out.println(count);

        //Option 2
        /*
        words.removeIf(each-> !each.equals(targetWord));
        System.out.println(words);
        System.out.println(words.size());

         */

        //Option 3

        int frequencyOf =Collections.frequency(words, targetWord);
        System.out.println(frequencyOf);

        Collections.reverse(words);
        System.out.println(words);

        Collections.swap(words, 0, 1);
        System.out.println(words);

        Collections.replaceAll(words, "javascript", "java");
        System.out.println(words);


    }
}
/*
        Task 4 : Target Words

                    Given an ArrayList of Strings and a target word (String)
                    print how many times the target word is in the ArrayList
                    Ex:
                    Input:
                        ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
                        Target: java

                        Output: 2
         */