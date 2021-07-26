package day29_ReturnMethods;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
       String str1="listen";
       String str2="silent";

      //boolean result=isAnagram(str1,str2);
        isAnagram(str1,str2);

    }
    public static boolean isAnagram(String str1, String str2){

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        //System.out.println(Arrays.toString(ch1));
        //System.out.println(Arrays.toString(ch2));
        boolean isAnagram=Arrays.equals(ch1,ch2);
        System.out.println(Arrays.equals(ch1,ch2)+" result is given");
        return isAnagram;
    }
}
/*
write a program that can check if two strings are anagram, return true
if they are anagram, otherwise return false;

isAnagram("listen,silent,)
 */
