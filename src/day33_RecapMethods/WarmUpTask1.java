package day33_RecapMethods;

import java.util.Arrays;

public class WarmUpTask1 {
    public static void main(String[] args) {

        String[] students={"Mohammed","Aleksandra","Elmira"};
        students=reverse(students);
        System.out.println(Arrays.toString(students));

        System.out.println("------------------------------------------------------------");
        int[] numbers={10,20,30,40,50};
        numbers=reverse(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------------------------------------");
        char[] chars={'A','B','C'};
        chars=reverse(chars);
        System.out.println(Arrays.toString(chars));
    }

     //reverses the given integer array
    public static int[] reverse(int[] array){// i: {1,2,3,4,5} ==>{5,4,3,2,1}
        int[] result=new int[array.length];  // j: {0,0,0,0,0}  ==>{5,4,3,2,1}

        for (int i = array.length-1, j=0; i>=0; i--, j++) {
            //j is  for index of result arrays and every time when i-- , j should be j++;
             result[j]=array[i];
        }

        return result;
    }

   //reverses the given String array
    public static String[] reverse(String[] array){// i: {1,2,3,4,5} ==>{5,4,3,2,1}
        String[] result=new String[array.length];  // j: {0,0,0,0,0}  ==>{5,4,3,2,1}

        for (int i = array.length-1, j=0; i>=0; i--, j++) {
            result[j]=array[i];
        }

        return result;
    }

    //reverses the given double array
    public static double[] reverse(double[] array){// i: {1,2,3,4,5} ==>{5,4,3,2,1}
        double[] result=new double[array.length];  // j: {0,0,0,0,0}  ==>{5,4,3,2,1}

        for (int i = array.length-1, j=0; i>=0; i--, j++) {
            result[j]=array[i];
        }

        return result;
    }

    //reverses the given char array
    public static char[] reverse(char[] array){
        char[] result=new char[array.length];

        for (int i = array.length-1, j=0; i>=0; i--, j++) {
            result[j]=array[i];
        }


        return result;
    }
}
/*
Task 1:
    1. create a method that can reverse an array of integer

    2. create a method that can reverse an array of double

    3. create a method that can reverse an array of String

    4. create a method that can reverse an array of char

 */