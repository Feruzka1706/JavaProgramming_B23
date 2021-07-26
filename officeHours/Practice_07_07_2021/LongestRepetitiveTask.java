package Practice_07_07_2021;

import java.util.Arrays;

public class LongestRepetitiveTask {
    public static void main(String[] args) {

        String word="abcdefabcdefabcdefabcdef";
        String longestOne="";
        String temp="";

        /*
        a--> it has some datas
        ab-->
        ..
        abc-->
        abcdef-->
         */

        for (int i = 0; i <word.length()/2 ; i++) {
          temp+=word.charAt(i);

          String[] split =word.split(temp);
            System.out.println(Arrays.toString(split));
        }

    }
}
/*
Longest Repetitive Substring -- Real Interview Task


            Write a program if some substring K that can be repeated N>1
            times to produce the input string exactly as it appears.
            Your program should return longest substring K, and
            if there is none it should be return "There is no repetitive substring"

            For Example is str ="abcababcababcab"                 output should be abcab
                           str ="abcdefabcdef"                    output should be abcdef
                           str ="abcdefabcdefabcdefabcdef"     output should be abcdefabcdef
                           str ="abcdefxabcdef"                   output should be "There is no repetitive substring"
 */