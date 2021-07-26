package day29_ReturnMethods;

import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {

        posNegZero(-10);
        System.out.println("---------------------------------------------");
        printMaxNumber(10,20);
        System.out.println("----------------------------------------");

        int[] array={100,200,-1,500,0,200};
        sortDescending(array);

    }
    public static void posNegZero(int number){

        if(number>0){
            System.out.println(number+" is positive number");
        }else if(number < 0){
            System.out.println(number+" is negative number");
        }else{
            System.out.println(number+" is zero");
        }

    }

    public static void printMaxNumber( int num1, int num2){

        System.out.println( (num1>num2? num1 : num2) +" is maximum number");
    }

    public static void sortDescending( int[] arr){
        Arrays.sort(arr);  //{1,2,3,4}
        int[] result=new int[arr.length];//{4,3,2,1}

        for (int i = arr.length-1, j=0;  i>=0 ; i--, j++ ) {
            //reversing array
           result[j]= arr[i];
        }
        System.out.println(Arrays.toString(result));
    }


}
/*
1. create a function that can check if the given integer is positive, negative or zero

2.create a function that can print out the maximum number between two numbers

3.create a function that can print out the array of integers in descending order
 */