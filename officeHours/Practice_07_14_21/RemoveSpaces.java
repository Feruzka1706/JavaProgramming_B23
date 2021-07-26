package Practice_07_14_21;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {
        removeSpaces("  Hello world      I      love      Java    ");
    }

    public static void removeSpaces(String str){
        String result="";

        String[] arr=str.trim().split(" ");
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {

            if( !arr[i].isEmpty()){
                result+=arr[i]+" ";
            }
        }
        System.out.println(result);
    }
}
/*
Task 3 :    Write a method that can remove  all extra space from String

    			 Input: "  Hello world      I      love      Java    "

        	     Output: Hello world I love Java
 */
