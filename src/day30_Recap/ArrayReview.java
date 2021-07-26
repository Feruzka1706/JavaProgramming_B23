package day30_Recap;

import java.util.Arrays;

public class ArrayReview {
    public static void main(String[] args) {

        String item="Eggs",
                item2="Milk",
                item3="Apple",
                item4="Chicken",
                item5="Papers";

        String[] items=new String[10];
        //right now our item arr =={null,null,null,.....};
        items[3]="Milk";
        //items[10]="Grape";//it will be out of bounds

        System.out.println(Arrays.toString(items));

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        //index:      0,1,2,3,4,5,6,7,8,9
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {//i: index nums of array
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
