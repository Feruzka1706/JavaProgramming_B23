package day37_CustomClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {

        ArrayList<String> students =new ArrayList<>();
        students.addAll(Arrays.asList("Nazli", "Gulistan","Ahmad","Feruza","Aykut","Ahmet","Yahya") );
        //it will return us array list

        System.out.println(students);
        Collections.swap(students,0,students.size()-1);
        System.out.println(students);

        System.out.println("---------------------------------------------------------------------");

        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,2,3,4,5,5,6,6,7,8,9,10) );

        //ArrayList<Integer> uniques =new ArrayList<>(numbers);
        //uniques.removeIf(p-> Collections.frequency(uniques,p) !=1);



        int firstUnique=0;
       // System.out.println(numbers);

        for(Integer each: numbers){
            if( Collections.frequency(numbers,each)==1 ){
           firstUnique=each;
           break;
           }
        }

        System.out.println(firstUnique);




        System.out.println("-----------------------------------------------------------------------");
        String str ="AABBCCDDEECCCDDDDDDDE";
        String result=""; //A2B2C2D2E2
        ArrayList<String> list =new ArrayList<>(Arrays.asList(str.split("") ) );

        for(String each:StringUtility.removeDup(str).split("") ){//A, B, C, D, E
            int frequency =Collections.frequency(list,each);//2  2  2  2  2
            result+=each+frequency;
        }

        System.out.println(list);
        System.out.println(result);

        System.out.println("------------------------------------------------------------------");

        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10) );

        ArrayList<Integer> original =new ArrayList<>();

       // Collections.sort(nums);//asc
       // Collections.reverse(nums);//desc

        int n=5;

        for (int i = 1; i <n; i++) {
            nums.removeIf(p-> p==Collections.max(nums) );
        }
        int fifthhMaxNumber= Collections.max(nums);
        System.out.println(fifthhMaxNumber);







    }
}
/*
1.write a program that can swap the first and last elements of an ArrayList

2. write a program that can return the first unique elements of an ArrayList

3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

4. Write a program that can return the nth largest number from an ArrayList of integers

 */