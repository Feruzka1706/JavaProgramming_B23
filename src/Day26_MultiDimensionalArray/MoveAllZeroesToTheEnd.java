package Day26_MultiDimensionalArray;

import java.util.Arrays;

public class MoveAllZeroesToTheEnd {
    public static void main(String[] args) {

        int[] array={10,0,5,0,1,0};

        int[] result=new int[array.length];
        //              {0,0,0,0,0,0}

        for (int i = 0,  j=0; i < array.length ; i++) {
            if(array[i]!=0){
                result[j]=array[i];
                j++;
                //after initializing the index, go to the next index
            }
        }
        /*

        int i=0;//index number of the result
        for (int each : array) {//10,0,5,0,1,0
            if(each!=0){
               result[i]=each;
               i++;
            }
        }
         */

        System.out.println( Arrays.toString(result));
    }
}
/*
rite a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

          solution 1:
              DO NOT use for each loop

          solution 2:
              MUST use for each loops
 */