package day31_Recap;

import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {
     String str="MMMMMMNNNNNNNNBBBBBBBBBBAAAAZZZZZZDDDDDDDDD";

        //System.out.println( removeDup( str ) );
        String r =removeDup(str);
        System.out.println(r);

        System.out.println("------------------------------------------------------------");
        String s1="Java",
                s2="Batch 23";

        System.out.println(isAnagram(s1,s2));

        System.out.println("----------------------------------------------");

        String word="MMMMMMMMMMMMNNNNNNNAAAAA";
       int n1= frequency(word, 'M');
        System.out.println(n1);

        System.out.println("---------------------------------------------------------");
        String s="aaaaaaaaabcccccdeeeeeef";
        String unique="";

        for (int i = 0; i <=s.length()-1 ; i++) {
            char each =s.charAt(i);
            int frequency=frequency(s,each);

            if(frequency==1){
                unique+=each;
            }
        }
        System.out.println(unique);

        System.out.println("--------------------------------------------------------");
        String s3="AAABBCCCC";//A3B2C4
        String result=""; //A3B2C4
           for( char each :removeDup(s3).toCharArray()){ // each: A, B, C
               int frequency=frequency(s3,each);
               //result+=""+each +frequency;
               result+= each;//ABC
               result+=frequency;//A3B2C4

           }

        System.out.println(result);

        System.out.println("------------------------------------------------------");
        String str4="MMMMMMMMMMNNNNNNNNHHHHHHHHHYYYYYYYYTTTTRRRREEEEEEE";

        String result2=frequencyOfChars(str4);
        System.out.println(result2);


    }

    //create a method that can remove duplicates from string , returns string
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

   // Write a return method named frequency that accepts two parameters: String and Char.
    // then returns the frequency of the char from the string
   // Ex:
    //frequency("AAAABB", 'A');  ==> 4
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

}
