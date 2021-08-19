package Practice_07_28_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfStrings {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>(Arrays.asList("123", "34", "513") );
        ArrayList<Integer> result= new ArrayList<>();

        for (int i = 0; i < list.size() ; i++) {
            int total=0;


            for (int j = 0; j <list.get(i).length() ; j++) {
                // total+=Integer.parseInt(""+list.get(i)).charAt(j) ));
                total+=Integer.parseInt(""+ list.get(i).charAt(j));
            }

            result.add(total);
        }

        System.out.println(result);



    }
}
/*
 Task 3 : String numbers to sum

                    Given an ArrayList of numbers in String format, add each digit of each element
                     and store into a different ArrayList.

                    Ex:

                    Input:
                    “123”, “34”, “513”

                    Output:
                    [ 6, 7, 9 ]
 */