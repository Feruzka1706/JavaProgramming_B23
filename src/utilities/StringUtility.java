package utilities;

import java.util.Arrays;

public class StringUtility {
    public static void main(String[] args) {
            reverse("Feruza");
    }

// it reverses any given string , and returns it
    public static String reverse(String str){//"ABC"
        //                                   0,1,2
        String reverse="";//"CBA"

        for (int i = str.length()-1; i>=0 ; i--) {//i: 2,1,0
            reverse += str.charAt(i);
        }
        return reverse;
    }


    //checks if the given string is palindrome, returns true||false result
    public static boolean isPalindrome(String str){
       String reversedStr=reverse(str);  //"avaJ"

        return str.equalsIgnoreCase(reversedStr);

    }


    //create a method that can remove the duplicates from given String and at the end
    //return string EX; ("AAAAAAAAAABBBBBBBBCCCCCCCCCC")==>"ABC"
    public static String removeDup (String str) {//"AABBBCC"

        String result="";

        /*
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }

         */

        for( char ch : str.toCharArray()){//{'A', 'A', 'B', 'B', 'B', 'C', 'C'}
            //to use FOR EACH LOOP there MUST be DATA STRUCTURE!!!
            if(result.indexOf(ch)<0){//!result.contains(""+ ch)
                //if the character is not contained in the result, then concatenate the character to result
                result+=ch;
            }
        }

        return result;
    }


    //checks if two strings are Anagram, and returns boolean result
    //"heart" & "earth" ==> isAnagram ==> true
    public static boolean isAnagram (String str1, String str2){

        char[] ch1= str1.toCharArray();//{'h','e','a','r','t'}
        char[] ch2=str2.toCharArray();//{'e','a','r','t','h'}

        Arrays.sort(ch1);//{a,e,h,r,t}
        Arrays.sort(ch2);//{a,e,h,r,t}

        boolean r=Arrays.equals(ch1, ch2);
        //return Arrays.equals(ch1,ch2);
        return r;
    }


    //frequency("AAAABB", 'A');  ==> 4
    //returns the frequency of ch from the given string
    public static int frequency (String str, char ch){

        int count=0;
        for(char each :str.toCharArray()){//each: represents each character of string
            if(each==ch){
                count++;
            }
        }
        return count;
    }


    //unique characters
    //returns unique characters from string
    public static String uniqueChars (String s){
        String unique="";

        for (int i = 0; i <=s.length()-1 ; i++) {
            char each =s.charAt(i);
            int frequency=frequency(s,each);

            if(frequency==1){
                unique+=each;
            }
        }
        return unique;
    }

    //frequencyOfChars(
    //returns the frequency of each characters, returns string
    public static String frequencyOfChars (String str){
        String result=""; //A3B2C4
        for( char each :removeDup(str).toCharArray()){ // each: A, B, C
            int frequency=frequency(str,each);
            //result+=""+each +frequency;
            result+= each;//ABC
            result+=frequency;//A3B2C4

        }
        return result;
    }


   //returns frequency of the word from the given sentence
    public static int frequencyOfWord (String sentence, String word){
        int count=0;//==>3 occured Java in the sentence
        sentence=sentence.toLowerCase();//for ignore the case sensitivity
        word=word.toLowerCase();//for ignore the case sensitivity
        while(sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            count++;
        }

        return count;
    }


}
