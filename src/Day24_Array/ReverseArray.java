package Day24_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5};
        int[] reversedArray=new int[array.length];
        //to enough capacity to contain the elements of original array
       /*
        reversedArray[0]=array[4];
        reversedArray[1]=array[3];
        reversedArray[2]=array[2];
        reversedArray[3]=array[1];
        reversedArray[4]=array[0];
        */
        int j=0;
        for (int i = array.length-1; i>=0;  i--) {
           reversedArray[j++]=array[i];//j is index of the reversed array her , we do j++ to increse of the reversed array each time
           //we get the elements of array starting last index and store to this array
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));



    }
}
/*
Write a program that can reverse an array of integers
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */