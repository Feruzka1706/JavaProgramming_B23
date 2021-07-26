package day25_ForEachLoop;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5};
        //index:       0 1 2 3 4

        for (int i = 0; i < numbers.length ; i++) {//i: index numbers of the array
            System.out.println(i);
        }

        System.out.println("---------------------------------------");
        //      each == is prefer name for each loop
        for (int each :numbers){//each:elements of the array
            System.out.println(each);
        }

        System.out.println("----------------------------");


        String[] names={"Ahmet","Boburbek","Farid","Robinson"};
        Arrays.sort(names);
        for (String eachName:names){//there is no index
            System.out.println(eachName);
        }
        //we can use for each loop if we don't need to use indexes
    }
}
