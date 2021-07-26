package Day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //2 dimensional array MUST contain 1 dimensional arrays
        // index:        0,1,2   0,1   0,1,2
        int[][] arr2D={ {1,2,3},{4,5},{6,7,8} };
        //index:           0,     1,      2
        System.out.println(arr2D.length);

        System.out.println(Arrays.deepToString(arr2D));

        //{4,5}
        System.out.println(Arrays.toString(arr2D[1]));
        //calling single dimensional array from two dimensional array

        System.out.println( arr2D[1][1]);

        System.out.println("--------------------------------------");

        for (int i = 0; i < arr2D.length ; i++) {
            int [] each1DArray=arr2D[i];
            //retrieve each single dimensional array

            System.out.println( Arrays.toString(each1DArray));
            for (int j = 0; j < each1DArray.length ; j++) {
                //j: index numbers of the elements in each single sigle dimensional array
                System.out.println(each1DArray[j]);
            }
        }

        System.out.println("----------------------------------------");

    }
}
