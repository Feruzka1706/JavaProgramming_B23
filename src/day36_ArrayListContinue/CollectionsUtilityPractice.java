package day36_ArrayListContinue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityPractice {
    public static void main(String[] args) {
        ArrayList<Character> chars=new ArrayList<>();
        chars.addAll(Arrays.asList('A','B','A','C','W','C','H'));
        chars.removeIf(p-> Collections.frequency(chars,p) !=1);

        System.out.println(chars);

        System.out.println("----------------------------------------------");

        String str="AABBCSYTHGG";
        ArrayList<String> result=new ArrayList<>(Arrays.asList(str.split("")));
        /*
        String uniques="";
        for(String each : result){
            if(Collections.frequency(result,each) ==1){
                uniques+=" "+each;
            }
        }
        //System.out.println(result);
        System.out.println(uniques);

         */

        result.removeIf(p-> Collections.frequency(result,p) !=1);
        System.out.println(result);
        System.out.println("--------------------------------------------------");

        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10,9,9,8,7,6,5,4,3,2,1) );
        //numbers.addAll(Arrays.asList(10,30,50,20,500,500,500,0,-20,-5,2));
        //find the third MAX NUMBER 

        int firstMax=Collections.max(numbers);
        System.out.println("firstMax = " + firstMax);

        numbers.removeIf(p-> p==Collections.max(numbers));
        int secondMax =Collections.max(numbers);
        System.out.println("secondMax = " + secondMax);

        numbers.removeIf(p-> p==Collections.max(numbers));
        int thirdMax=Collections.max(numbers);

        System.out.println("thirdMax = " + thirdMax);





    }
}
