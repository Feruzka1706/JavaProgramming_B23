package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {

        String str="AAABBBBBBBCCCCCCCDDDDDDDDDEEEEfffeFFFFFFFFFFFF";
        String[] arr= str.split("");
        System.out.println(Arrays.toString(arr));

        char[] arr2=str.toCharArray();
        System.out.println(Arrays.toString(arr2));

       String result= removeDuplicates(str);
        System.out.println(result);

    }

    public static String removeDuplicates(String str){
        String result="";  //"ABC"
        for(String each:str.split("")){ //{"A","A",........"C"}
            if(!result.contains(each)){
              result+=each;
            }
        }
      /*
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }

       */
        return result;
    }
}
/*
write a program that remove duplicates from String
EX: "AABBBBCCCCCCC"
    "ABC"
 */