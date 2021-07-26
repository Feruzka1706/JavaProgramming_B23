package Day24_Array;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String s1 ="race";//aehrt
        String s2="care";//aehrt

        char[] ch1 =s1.toCharArray();// we can use the sort method
        char[] ch2 =s2.toCharArray();// we can use the sort method
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        
        boolean isAnagram =Arrays.equals(ch1,ch2);

        System.out.println("isAnagram = " + isAnagram);

    }
}
/*
Input:
   heart & earth
   race & care
   listen & silent

output:
      true
 */