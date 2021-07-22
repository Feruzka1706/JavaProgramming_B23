package Practice_07_21_2021;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(8);

        //arrayFibonacci(8);

    }

    public static void fibonacci (int number){

        int p2=0;
        int p1=1;
        int result=0;
        System.out.println(p2);
        System.out.println(p1);

        for (int i = 2; i <=number ; i++) {

            result=p1+p2;
            System.out.println(result);

            p2=p1;
            p1=result;
        }
    }

    public static  void arrayFibonacci(int number){

        int[] fibonacci=new int[number];

        fibonacci[0]=0;
        fibonacci[1]=1;

        for (int i = 2; i <=fibonacci.length ; i++) {
             fibonacci[i]= fibonacci[i-1]+fibonacci[i-2];
        }

        System.out.println(Arrays.toString(fibonacci));
    }

}
/*
Fibonacci
				Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
				Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
				Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
				    Ex:
				        Input:
				            8
				        Output:
				            0, 1, 1, 2, 3, 5, 8, 13, 21
				            index       Values
				              0           0
				              1           1
				              2           1     index0+index1
				              3           2     index1+index2
				              4           3     index2+index3
				              5           5     2+3
				              6           8     3+5
				              7           13    5+8
				              8           21    8+13
 p2=0   p1=1   result 1
 p2=1   p1=1   result 2
 p2=1   p1=2   result 3
 p2=2   p1=3   result 5
 */